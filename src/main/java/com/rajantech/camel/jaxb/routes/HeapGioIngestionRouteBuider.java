package com.rajantech.camel.jaxb.routes;


import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.processor.validation.SchemaValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.rajantech.camel.jaxb.beans.GooglePubSubCustomException;
import com.rajantech.camel.jaxb.beans.GoogleRetryPubSubCustomException;
import com.rajantech.camel.jaxb.beans.HeatGioIngestionBean;

/*IMPORTANT NOTE 1:- When we will get new XSD ,we will generate the Java(POJO) class(com.ups.heat.ingestion.gio.model) form XSD.
 * In newly generated java class we need to convert the XMLGregorianCalendar objects to String objects. The reason for this is because
 * when the dates are read within POJO they are converted back into Millisecond format. We then have to convert those back 
 * to Formatted dates (using json format annotation below) and times that results in timezone related differences between different dates. 
 *  * @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	   @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	   @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
	Our goal is that we GIO ingestion will send the dates exactly similar to how those have been received in the XML without any specific 
	conversion.
	
 *IMPORTANT NOTE 2:- GIO XML when converted to JSON resulted in JSON being populated with null fields by default. This resulted in large size JSON
 *		Payload which when converted into Base 64 before sending to GCP. 
 *	The following annotation needs to be added to all GIO XSD JAXB generated java classes - @JsonInclude(Include.NON_NULL)
 *	The following analysis was performed
 * Test 1 â€“ Table represents current as-is in production
		File Name	XML Size (Bytes)	JSON Size (Bytes)	% Diff (XML to JSON)	Base 64 Encoded Size	% Diff (XML to Base 64 encoded)
		Gio1.xml	4722 				7432				157						9912					210
		Gio2.xml	4806				7480				156						9976					208
		Gio3.xml	6879				9224				134						12300					179
		Gio5.xml	8244				10176				123						13568					165
		
		
		Test 2 â€“ Table represents â€œWhat ifâ€� scenario if we decide to strip out all null attributes from GIO JSON
		File Name	XML Size (Bytes)	JSON Size (Bytes)Without Nulls	% Diff (XML to JSON)	Base 64 Encoded Size	% Diff (XML to Base 64 encoded)
		Gio1.xml	4722				2312							49						3084					65
		Gio2.xml	4806				2361							49						3148					66
		Gio3.xml	6879				3409							50						4548					66
		Gio5.xml	8244				4095							50						5460					66
		
		
		This could have a very positve impact on network usage as follows:
		File Name	Current send size to GCP (JSON with null)	Proposed Send Size (JSON without null)	% Reduction in network usage
		Gio1.xml	9912										3084									69
		Gio2.xml	9976										3148									68
		Gio3.xml	12300										4548									63
		Gio5.xml	13568										5460									60
		
		*IMPORTANT NOTE 3:- Because AMQ Subcribing brokers was unable to load balance Subscribing PODs, it was recommended by AMQ team to separate out any DQL process
		*logic from main GIO microservice (this service) to a new microservice HEAT-GIO-REPROCESS-INGESTION.
 		
 		*IMPORTANT NOTE 4:- GIO XMLs are processed by HEAT-GIO-REPROCESS-INGESTION Microservice as well. 
 		* When changes are made for GIO, the same need to be replicated to GIO Reprocess also.
		745598 - GIO Enhancement -  Process DLQ.Consumer.HEAT_001.VirtualTopic.UPS.O PS.GIO.PackageStateCMv2 Messages	
		The following is done on AMQ broker side when Publishing broker fails to deliver messages to Subscribing broker Queue
		Once a message's redelivery attempts exceeds the maximumRedeliveries (6 times)configured for the Redelivery Policy, a "Poison ACK" is sent back to the broker 
		letting him know that the message was considered a poison pill. 
		The Broker then takes the message and sends it to a Dead Letter Queue so that it can be analyzed later on.
		So, we  set an individualDeadLetterStrategy in the destination policy map of the activemq.xml configuration file, 
		which allows you to specify a specific dead letter queue prefix for a given queue or topic.
		Application needs to put expiry on those messages are run a process to read and throw the messages 

 * 
 */

@Component
public class HeapGioIngestionRouteBuider extends RouteBuilder {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	/*
	* Note: GIO Schema is not compliant with the XMLs that are generated from GIO.
	*/
	private static final String XSD_VALIDATOR = "validator:com/ups/heat/ingestion/gio/xsd/AP369 GIO PubSub CMv2 tok July 1.14.0.xsd";
	private static final String JAXB_CONTEXT_PATH = "com.rajantech.camel.jaxb.model";
	
	@Value("${activemq.endpoint}")
	private String amqEndpoint;
	
	@Value("${heat.gio.routeid}")
	private String routeID;
	
	@Value("${activemq.DLQReprocess}")
	private String DLQReprocess;
	
	
	
	@Override
	public void configure() throws Exception {
		
		
		JacksonDataFormat jsonOrder = new JacksonDataFormat();
		//jsonOrder.setPrettyPrint(true);
		JaxbDataFormat jaxb = new JaxbDataFormat();
		jaxb.setContextPath(JAXB_CONTEXT_PATH);
		
		
		onException(Throwable.class)
		.handled(true)
		.log("Exception processing camel route for HEAT GIO, this XML was unable to be processed ## ")
		;
	
		
		from("file://work?noop=true").routeId(routeID)
		.to("log:com.ups.heat.ingestion.gio.camel.routes.HeapGioIngestionRouteBuider?level=INFO&groupInterval=10000&groupDelay=10000&groupActiveOnly=true").id("AggregateLogging")
		.convertBodyTo(String.class).id("convertBodyToString")
		.unmarshal(jaxb).id("UnmarshalJaxb")
		.marshal(jsonOrder).id("marshalJson")
		.log(" ### ${body} ")
		.end();

		
		 
	}
	

}

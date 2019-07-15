package com.rajantech.camel.jaxb.beans;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rajantech.camel.jaxb.model.PkgSt;

@Service
public class HeatGioIngestionBean {

	private final Logger log = LoggerFactory.getLogger(HeatGioIngestionBean.class);
	
	public String epochToDate(Object body) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			return mapper.writeValueAsString(body);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public void logExecutionTime(Exchange exchange) {
		Date startTime = (Date)exchange.getIn().getHeader("StartTime");
		Date endTime = (Date)exchange.getIn().getHeader("EndTime");
		log.info("Time taken to process GIO message E2E - {}", endTime.getTime() - startTime.getTime());
	}

	public void logTrackingNum(Exchange exchange) {
		try {
			PkgSt gioPkg = (PkgSt)exchange.getIn().getBody();
			if (gioPkg != null && 
					gioPkg.getShu() != null && 
						gioPkg.getShu().getPkgTckNr() != null && 
					gioPkg.getMsgHdr() != null &&
						gioPkg.getMsgHdr().getMsgTs() != null) {
				log.info("Received GIO message with Package tracking Number {} at MsgTs {}", gioPkg.getShu().getPkgTckNr().getValue(), gioPkg.getMsgHdr().getMsgTs());
			}
		} catch (Exception e) {
			log.info("Unable to print the tracking number or message timestamp from incoming GIO message ");
		}
	}
}

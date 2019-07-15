package com.rajantech.camel.jaxb.components;

import org.apache.camel.CamelContext;
import org.apache.camel.converter.stream.CachedOutputStream;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddCamelComponents {

	public static final String ACTIVEMQ = "activemq";
	public static final String POOL_ACTIVEMQ = "poolActivemq";
	
	
	@Autowired
	private ActiveMQConfiguration activeMQ;

	@Bean
	CamelContextConfiguration contextConfiguration() {
		return new CamelContextConfiguration() {
			public void beforeApplicationStart(CamelContext context) {
				context.addComponent(ACTIVEMQ, activeMQ.createActiveMQPoolComponentCon());
				context.addComponent(POOL_ACTIVEMQ, activeMQ.createActiveMQPoolComponentPub());
				
			}

			public void afterApplicationStart(CamelContext arg0) {
				// TODO Auto-generated method stub

			}
		};
	}

}

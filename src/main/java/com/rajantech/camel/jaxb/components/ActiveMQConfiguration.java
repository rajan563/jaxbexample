package com.rajantech.camel.jaxb.components;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.activemq.jms.pool.PooledConnectionFactory;
import org.apache.camel.component.jms.JmsConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ActiveMQConfiguration {


 	@Value("${activemq.maxConConnection}")
	private Integer maxConMQConnection;
 	
 	@Value("${activemq.maxPubConnection}")
	private Integer maxPubMQConnection;
	
	@Value("${activemq.user}")
	private String user;

	@Value("${activemq.password}")
	private String password;

	@Value("${activemq.broker-url}")
	private String url;

	/**
	 * Publisher Connection Factory
	 * @return
	 */
	public ActiveMQComponent createActiveMQPoolComponentPub() {

		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(user, password, url);
	    
		PooledConnectionFactory poolConnectionFactory = new PooledConnectionFactory();
		poolConnectionFactory.setMaxConnections(maxPubMQConnection);
		poolConnectionFactory.setConnectionFactory(connectionFactory);
		
		JmsConfiguration jmsConfig = new JmsConfiguration();
		jmsConfig.setConnectionFactory(connectionFactory);
		ActiveMQComponent activeMQ = new ActiveMQComponent();
		activeMQ.setConfiguration(jmsConfig);
		return activeMQ;
	}
	
	/**
	 * Consumer Connection Factory
	 * @return
	 */
	public ActiveMQComponent createActiveMQPoolComponentCon() {

		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(user, password, url);
	    
		PooledConnectionFactory poolConnectionFactory = new PooledConnectionFactory();
		poolConnectionFactory.setMaxConnections(maxConMQConnection);
		poolConnectionFactory.setConnectionFactory(connectionFactory);
		
		JmsConfiguration jmsConfig = new JmsConfiguration();
		jmsConfig.setConnectionFactory(connectionFactory);
		ActiveMQComponent activeMQ = new ActiveMQComponent();
		activeMQ.setConfiguration(jmsConfig);
		return activeMQ;
	}
	
}
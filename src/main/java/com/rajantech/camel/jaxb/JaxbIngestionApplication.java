package com.rajantech.camel.jaxb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
* <h1>HeatGioIngestionApplication</h1> 
* The HeatGioIngestionApplication is a SpringBoot Class.
* @SpringBootApplication is a convenience annotation that adds all of the following:
* @Configuration tags the class as a source of bean definitions for the application context.
* @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. 
*@ComponentScan tells Spring to look for other components, configurations, and services in the hello package, allowing it to find the controllers.
*The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. Did you notice that there wasn’t a single line of XML? No web.xml file either. This web application is 100% pure Java and you didn’t have to deal with configuring any plumbing or infrastructure. 
* @author Brijesh Kumar
* @version 1.0
* @since 2018-05-2
*/

@SpringBootApplication
public class JaxbIngestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxbIngestionApplication.class, args);
	}
}

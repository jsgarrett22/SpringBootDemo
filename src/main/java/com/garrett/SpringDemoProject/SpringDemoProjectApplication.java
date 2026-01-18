package com.garrett.SpringDemoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoProjectApplication {

	/**
	 * The main starting point of the Spring Boot application. Creates the Spring IoC container.
	 * @param args
	 */
	public static void main(String[] args) {
		// Creates the Spring IoC container and assigns the container
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoProjectApplication.class, args);
		
		// Get a bean from the context
		Dev dev = context.getBean(Dev.class);
		
		// Invoke method from obj given by bean
		dev.build();
	}

}

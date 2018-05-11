package com.spring.log4j;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringLog4j1Application {
	
	
	private static final Logger logger = Logger.getLogger(SpringLog4j1Application.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringLog4j1Application.class, args);
		logger.error("Hello World.....Welcome to the Log4j");
	}
}

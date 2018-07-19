package com.spring.profiles.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


// Another way of doing profile is by using the annotation @Profile 
@Profile("dev")
@Configuration
public class SpringConfig {

	@PostConstruct
	public void display() {
		System.out.println("This is running from DEV Profile");
	}
}

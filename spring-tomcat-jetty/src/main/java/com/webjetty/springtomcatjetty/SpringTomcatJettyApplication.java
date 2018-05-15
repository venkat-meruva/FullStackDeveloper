package com.webjetty.springtomcatjetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTomcatJettyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTomcatJettyApplication.class, args);
	
	}
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello.. World";
	}
	
	
}

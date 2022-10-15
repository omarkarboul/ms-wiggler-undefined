package com.esprit.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SterilizationMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SterilizationMsApplication.class, args);
	}

}

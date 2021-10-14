package com.example.flightApp;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FlightAppUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightAppUserApplication.class, args);
	}

}

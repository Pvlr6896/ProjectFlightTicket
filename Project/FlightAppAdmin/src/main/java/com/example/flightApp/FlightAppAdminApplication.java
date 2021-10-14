package com.example.flightApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FlightAppAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightAppAdminApplication.class, args);
	}

}

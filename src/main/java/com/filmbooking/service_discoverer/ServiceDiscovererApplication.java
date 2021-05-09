package com.filmbooking.service_discoverer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscovererApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscovererApplication.class, args);
	}

}

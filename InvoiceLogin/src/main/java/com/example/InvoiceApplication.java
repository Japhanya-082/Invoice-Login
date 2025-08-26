package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication(
	    exclude = {
	        org.springframework.boot.autoconfigure.web.client.RestClientAutoConfiguration.class
	    }
	)
	@EnableDiscoveryClient  // This replaces @EnableEurekaClient in Spring Cloud 2023+
	
public class InvoiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceApplication.class, args);
	}

}

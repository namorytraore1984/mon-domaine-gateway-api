package com.next.technologies.mondomainegatewayapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MonDomaineGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonDomaineGatewayApiApplication.class, args);
	}

}

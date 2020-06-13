package com.example.customereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CustomerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerEurekaServerApplication.class, args);
	}

}

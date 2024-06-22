package com.kunal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiagnosisMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiagnosisMicroserviceApplication.class, args);
	}

}

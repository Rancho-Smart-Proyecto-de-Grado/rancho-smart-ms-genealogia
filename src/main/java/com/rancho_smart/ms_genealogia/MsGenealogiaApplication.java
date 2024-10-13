package com.rancho_smart.ms_genealogia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsGenealogiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGenealogiaApplication.class, args);
	}

}

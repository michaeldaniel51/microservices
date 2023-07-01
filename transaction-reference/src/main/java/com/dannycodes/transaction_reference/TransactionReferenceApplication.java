package com.dannycodes.transaction_reference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TransactionReferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionReferenceApplication.class, args);
	}



}

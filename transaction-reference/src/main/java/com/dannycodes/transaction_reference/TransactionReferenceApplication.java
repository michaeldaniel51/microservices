package com.dannycodes.transaction_reference;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
@EnableDiscoveryClient
//@OpenAPIDefinition(info =
//@Info(title = "transaction service", version = "1.0", description = "Documentation transaction service API v1.0")
//)
public class TransactionReferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionReferenceApplication.class, args);
	}


	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return  new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("HEAD","GET","PUT","POST","DELETE","PATCH");
			}
		};
	}


}

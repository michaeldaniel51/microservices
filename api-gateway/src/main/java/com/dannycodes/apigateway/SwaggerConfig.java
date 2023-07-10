package com.dannycodes.apigateway;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SwaggerConfig {

    @Bean
    public OpenAPI gateWayOpenApi() {
        return new OpenAPI().info(new Info().title("API Gateway Service ")
                .description("Documentation for all the Microservices in API The Gateway If Any!!")
                .version("v1.0.0")
                .contact(new Contact()
                        .name("API Gateway Development Team")
                        .email("apigateway@company.com")));
    }


}

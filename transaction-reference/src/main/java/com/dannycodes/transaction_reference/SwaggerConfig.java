package com.dannycodes.transaction_reference;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.OAuthScope;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;




@OpenAPIDefinition(servers = { @Server(url = "https://localhost:8087")}, info = @Info(title = "Transaction Service ", description = "This lists all the Transaction Service API Calls. The Calls are OAuth2 secured, "
        + "so please use your client ID and Secret to test them out.",
        version = "v1.0"))
@SecurityScheme(name = "security_auth", type = SecuritySchemeType.OAUTH2,
        flows = @OAuthFlows(clientCredentials  = @OAuthFlow(tokenUrl = "${openapi.oAuthFlow.tokenUrl}", scopes = {
                @OAuthScope(name = "openid", description = "openid scope")
        })))
@Configuration
public class SwaggerConfig {


//    @Bean
//    public OpenAPI customOpenAPI(
//            @Value("${openapi.service.title}") String serviceTitle,
//            @Value("${openapi.service.version}") String serviceVersion,
//            @Value("${openapi.service.url}") String url) {
//        return new OpenAPI()
//                .servers(List.of(new Server().url(url)))
//                .info(new Info().title(serviceTitle).version(serviceVersion));
//    }


}

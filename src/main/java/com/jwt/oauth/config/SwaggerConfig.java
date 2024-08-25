package com.jwt.oauth.config;

import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.Configuration;

/*
 * @author Naveen K Wodeyar
 * @date 25-08-2024
 */
@Configuration
public class SwaggerConfig {


    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("OpenAuthentication2.0")
                        .description("Spring Boot demo project for Open Authentication")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Naveen K Wodeyar")
                                .url("http://naveen.co.in")
                                .email("naveenwodeyar@yahoo.com"))
                        .license(new License()
                                .name("My License")
                                .url("http://www.license.co.in"))
                );
    }
}

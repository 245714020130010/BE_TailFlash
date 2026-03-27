package com.webservice.be_tailflash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI tailFlashOpenApi() {
        return new OpenAPI().info(
            new Info()
                .title("TailFlash API")
                .version("v1")
                .description("Contract-first API for TailFlash backend")
        );
    }
}

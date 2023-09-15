package com.ai.codegeneration.sig.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * Spring Boot Application
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableAutoConfiguration
public class CheckoutApplication {

    //Spring Boot Application
    public static void main(String[] args) {
         SpringApplication.run(CheckoutApplication.class, args);
    }

}

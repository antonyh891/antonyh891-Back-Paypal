package com.prueba.paypal;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class TestPaypalApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(TestPaypalApplication.class, args);
    }
}

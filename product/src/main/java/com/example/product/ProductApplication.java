package com.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ProductApplication.class, args);
        String username = run.getEnvironment().getProperty("username");
        String password = run.getEnvironment().getProperty("passage");
        System.out.println(username + "  " + password);

    }

}

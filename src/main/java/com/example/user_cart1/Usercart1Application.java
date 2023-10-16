package com.example.user_cart1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication

@EnableGlobalMethodSecurity(prePostEnabled=true)
public class Usercart1Application {

    public static void main(String[] args) {
        SpringApplication.run(Usercart1Application.class, args);
    }
}

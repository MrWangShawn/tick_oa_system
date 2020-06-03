package com.qust.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qust")
public class TickOaSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TickOaSystemApplication.class, args);
    }

}

package com.qust;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.qust.mapper")
public class TickOaSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TickOaSystemApplication.class, args);
    }

}

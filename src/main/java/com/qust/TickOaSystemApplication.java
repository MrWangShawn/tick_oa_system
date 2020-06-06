package com.qust;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

<<<<<<< HEAD:src/main/java/com/qust/application/TickOaSystemApplication.java
@SpringBootApplication(scanBasePackages = "com.qust")
=======
@SpringBootApplication
@MapperScan(value = "com.qust.mapper")
>>>>>>> origin/master:src/main/java/com/qust/TickOaSystemApplication.java
public class TickOaSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TickOaSystemApplication.class, args);
    }

}

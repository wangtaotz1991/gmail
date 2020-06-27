package com.example.gmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.gmail.user.mapper")
public class GmailUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmailUserApplication.class, args);
    }

}

package com.jupiter.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootCsvParserApplication {
    //TODO Add Spring Security with DB authorization (not in memory)
    //TODO Configure JWT
    //TODO Add Docker image
    //TODO Add PostgreSQL to your app (Do not disable travis!!!)
    //TODO Deploy your app to AWS or GCP
    //TODO Add Angular ui implementation to your app

    public static void main(String[] args) {
        SpringApplication.run(BootCsvParserApplication.class, args);
    }
}

package com.chatchatabc.cargo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class CargoApp {
    public static void main(String[] args) {
        SpringApplication.run(CargoApp.class, args);
    }
}

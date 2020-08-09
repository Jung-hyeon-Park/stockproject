package com.parkjh.stockproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class StockprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockprojectApplication.class, args);
    }

}

package com.parkjh.covidproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CovidprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidprojectApplication.class, args);
    }

}

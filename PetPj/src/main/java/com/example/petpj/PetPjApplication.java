package com.example.petpj;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetPjApplication {

    public static void main(String[] args) {
        SpringApplication application =
                new SpringApplication(PetPjApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
        SpringApplication.run(PetPjApplication.class, args);
    }

}

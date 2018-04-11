package com.stargis.client01eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Client01EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Client01EurekaApplication.class, args);
    }
}

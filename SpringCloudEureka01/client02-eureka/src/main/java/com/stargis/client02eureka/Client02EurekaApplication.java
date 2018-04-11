package com.stargis.client02eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Client02EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Client02EurekaApplication.class, args);
    }
}

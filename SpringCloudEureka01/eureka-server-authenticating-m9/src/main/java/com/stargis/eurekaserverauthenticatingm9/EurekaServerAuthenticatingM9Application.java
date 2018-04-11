package com.stargis.eurekaserverauthenticatingm9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAuthenticatingM9Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAuthenticatingM9Application.class, args);
    }
}

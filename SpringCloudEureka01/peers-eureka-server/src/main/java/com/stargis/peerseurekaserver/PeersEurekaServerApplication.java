package com.stargis.peerseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class PeersEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeersEurekaServerApplication.class, args);
    }
}

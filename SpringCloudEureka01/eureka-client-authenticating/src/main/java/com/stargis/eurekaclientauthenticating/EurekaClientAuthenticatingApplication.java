package com.stargis.eurekaclientauthenticating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author Chen.YH
 * @Date 2018-04-10 20:35
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientAuthenticatingApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAuthenticatingApplication.class, args);
    }
}

package com.daggerok.eurekaserverpeer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerPeer1 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerPeer1.class, args);
    }
}

package com.daggerok.client;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class EurekaZonedClient {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZonedClient.class, args);
    }
}

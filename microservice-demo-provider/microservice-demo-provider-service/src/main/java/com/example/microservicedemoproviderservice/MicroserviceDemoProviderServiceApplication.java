package com.example.microservicedemoproviderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceDemoProviderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDemoProviderServiceApplication.class, args);
    }

}

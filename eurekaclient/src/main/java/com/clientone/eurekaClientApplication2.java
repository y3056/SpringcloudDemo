package com.clientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class eurekaClientApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(eurekaClientApplication2.class,args);
    }
}

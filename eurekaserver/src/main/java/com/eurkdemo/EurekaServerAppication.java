package com.eurkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication//声明该类是 SpringBoot 服务的入口。
@EnableEurekaServer//声明该类是一个 EurekaServer  微服务 ，提供服务注册和服务发现，即注册中心
public class EurekaServerAppication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAppication.class,args);
    }
}

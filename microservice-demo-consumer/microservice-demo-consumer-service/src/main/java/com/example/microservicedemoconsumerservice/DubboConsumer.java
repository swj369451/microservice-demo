package com.example.microservicedemoconsumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication注解一般放在项目的一个启动类上，
 * 用来把启动类注入到容器中，用来定义容器扫描的范围，用来加载classpath环境中一些bean
 */
@SpringBootApplication
public class DubboConsumer {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer.class, args);
    }
}
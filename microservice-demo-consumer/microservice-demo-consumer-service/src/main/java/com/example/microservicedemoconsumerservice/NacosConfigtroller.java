package com.example.microservicedemoconsumerservice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林世哲
 * @Data 2022/5/21 14:26
 * @Version 1.0
 */
@RestController
@RefreshScope // 实现动态刷新的注解
public class NacosConfigtroller {

    @Value("${config.appName}")
    private String appName;


    @GetMapping("/test2")
    public String nacosConfingTest1() {
        return appName;
    }
}


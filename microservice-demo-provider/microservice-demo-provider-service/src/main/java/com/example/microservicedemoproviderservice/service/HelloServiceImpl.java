package com.example.microservicedemoproviderservice.service;

import com.example.microservicedemoproviderapi.HelloService;
import org.apache.dubbo.config.annotation.Service;
/**
 * @author 林世哲
 * @Data 2022/5/5 15:29
 * @Version 1.0
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello SpringCloud Alibaba Dubbo";
    }
}

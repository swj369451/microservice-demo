package com.example.microservicedemoconsumerservice.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import com.example.microservicedemoproviderapi.HelloService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林世哲
 * @Data 2022/5/5 16:50
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo")
public class HelloController {

//    用于标记这个服务具体使用了生产的哪个接口实现的
    @DubboReference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello() {
        return helloService.sayHello();
    }
}

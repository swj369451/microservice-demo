package com.example.microservicedemoconsumerservice.controller;

import com.example.microservicedemoproviderapi.HelloService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林世哲
 * @Data 2022/5/5 16:50
 * @Version 1.0
 */
@RestController
@RequestMapping(("/demo"))
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello() {
        return helloService.sayHello();
    }
}

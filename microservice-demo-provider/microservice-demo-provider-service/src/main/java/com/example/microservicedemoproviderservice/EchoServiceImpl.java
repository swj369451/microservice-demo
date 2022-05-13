package com.example.microservicedemoproviderservice;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.apache.dubbo.config.annotation.Service;
import com.example.microservicedemoproviderapi.EchoService;

/**
 * @Service dubbo提供者服务用于声明对外暴露服务
 *
 * 1.只能定义在一个类上，表示一个服务的具体实现
 * 2.interfaceClass：指定服务提供方实现的 interface 的类
 * 3.interfaceName：指定服务提供方实现的 interface 的类名
 * 4.version：指定服务的版本号
 * 5.group：指定服务的分组
 * 6.export：是否暴露服务
 * 7.registry：是否向注册中心注册服务
 * 8.application：应用配置
 * 9.module：模块配置
 * 10.provider：服务提供方配置
 * 11.protocol：协议配置
 * 12.monitor：监控中心配置
 * 13.registry：注册中心配置
 */
@Service(version = "1.0.0", group = "DUBBO")
public class EchoServiceImpl implements EchoService {

    public String echo(String name) {
        return "hello" + name;
    }
}

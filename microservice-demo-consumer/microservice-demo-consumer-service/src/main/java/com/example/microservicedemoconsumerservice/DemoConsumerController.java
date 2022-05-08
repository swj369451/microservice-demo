package com.example.microservicedemoconsumerservice;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.microservicedemoproviderapi.EchoService;

import javax.annotation.Resource;

@RestController
public class DemoConsumerController {

    /**
     * @Reference 用于dubbo消费者服务指明引用哪个提供者接口服务
     * 可以定义在类中的一个字段上，也可以定义在一个方法上，甚至可以用来修饰另一个 annotation，表示一个服务的引用。通常 @Reference 定义在一个字段上
     * interfaceClass：指定服务的 interface 的类
     * interfaceName：指定服务的 interface 的类名
     * version：指定服务的版本号
     * group：指定服务的分组  当一个接口有多个实现，可以用分组区分，必需和服务提供方一致
     * url：通过指定服务提供方的 URL 地址直接绕过注册中心发起调用
     * application：应用配置
     * module：模块配置
     * consumer：服务消费方配置
     * .protocol：协议配置
     * .monitor：监控中心配置
     * .registry：注册中心配置

     */
    @Reference(check = false, version = "1.0.0", group = "DUBBO")
    private EchoService demoService;


    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public Boolean ping() {
        try {
            String pong = demoService.echo("ping");

            System.out.println("Service returned: " + pong);
            return pong.contains("ping");
        } catch (Throwable t) {
            t.printStackTrace();
            return false;
        }
    }

    /**
     * @PathVariable 让方法参数的值对应绑定到一个URl模板上
     */
    @RequestMapping(value = "/consumer-echo/{str}", method = RequestMethod.GET)
    public String feign1(@PathVariable String str) {
        long start = System.currentTimeMillis();

        String result = demoService.echo(str);

        long end = System.currentTimeMillis();
        return "" + start + " Consumer received." +
                "\t" + result +
                "\r\n" + end + " Consumer Return";
    }
}
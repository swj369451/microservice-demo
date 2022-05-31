package com.example.microservicedemoconsumerservice;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.microservicedemoproviderapi.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林世哲
 * @Data 2022/5/11 20:16
 * @Version 1.0
 */
@RestController
@Slf4j
public class query {

    @Reference
    private Query query;

    @GetMapping("/query1")
    /**
     * 定义一个资源
     * 定义当资源内部发生异常的时候的处理逻辑
     * blockHandler 定义当资源内部发生了BlockException应该进入的方法【捕获的是Sentinel定义的异常】
     * 要求：
     * 1、当前方法的返回值和参数要更原方法一致
     * 2、但是允许在参数列表的最后加入一个参数BlockException,用来接收原方法中发生的异常
     * fallback 定义当资源内部发生了 Throwable英爱进入的方法
     */
    @SentinelResource(value = "getUserGoods",blockHandler ="blockHandler",fallback = "fallback")
    public String getUserGoods() throws InterruptedException {
        return query.queryGood();
    }

    public String blockHandler(BlockException e){
        return "服务器在忙";
    }

    public String fallback(Throwable e){
        return "你错了";
    }



    @GetMapping("/query2")
    @SentinelResource("getUserGoods2")
    public String getUserGoods2( String name, Integer age) throws InterruptedException {
        query.queryGood();
        return "成功2"+name+age;
    }

}

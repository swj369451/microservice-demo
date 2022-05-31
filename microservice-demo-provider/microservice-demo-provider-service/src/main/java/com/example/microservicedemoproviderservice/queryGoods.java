package com.example.microservicedemoproviderservice;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.microservicedemoproviderapi.Query;

import java.util.concurrent.TimeUnit;

/**
 * @author 林世哲
 * @Data 2022/5/11 20:14
 * @Version 1.0
 */
@Service
public class queryGoods implements Query {
    public String queryGood() throws InterruptedException {
//        long startTime=System.currentTimeMillis();
          TimeUnit.SECONDS.sleep(2);
//        long endTime=System.currentTimeMillis();
//        System.out.println("运行时间为："+(endTime-startTime));
        return "查找到商品";
    }
}

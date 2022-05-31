package com.example.microservicedemoconsumerservice.confine;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author 林世哲
 * @Data 2022/5/14 9:32
 * @Version 1.0
 */
public class BlockHandler {

    public static String blockHandlerA(BlockException exception){
        return "服务器正在忙请！";
    }

    public static String blockHandlerB(BlockException exception){

        return "这是第二个限流降级方法";
    }
}

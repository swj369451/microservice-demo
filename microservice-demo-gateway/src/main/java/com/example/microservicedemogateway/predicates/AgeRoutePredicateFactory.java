package com.example.microservicedemogateway.predicates;//package com.example.apigateway.predicates;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Predicate;
//
///**
// * @author 林世哲
// * @Data 2022/5/27 16:30
// * @Version 1.0
// */
//@Slf4j
//@Component
//public class AgeRoutePredicateFactory extends AbstractRoutePredicateFactory<AgeRoutePredicateFactory.Config> {
//
//    public AgeRoutePredicateFactory() {
//        super(AgeRoutePredicateFactory.Config.class);
//    }
//
//    //读取配置文件中的参数 给他赋值到配置类中的属性上
//    @Override
//    public List<String> shortcutFieldOrder() {
//        return Arrays.asList("min","max");//要和配置类的参数相同
//    }
//
//    @Override
//    public Predicate<ServerWebExchange> apply(AgeRoutePredicateFactory.Config config) {
//       return new Predicate<ServerWebExchange>() {
//           @Override
//           public boolean test(ServerWebExchange serverWebExchange) {
//               //接收前台传进来的参数
//               String ageStr = serverWebExchange.getRequest().getQueryParams().getFirst("age");
//               if(StringUtils.isNotEmpty(ageStr)){
//           }
//       };
//    }
//
//    //配置类，用于接收配置文件对应的参数
//    @Data
//    @NoArgsConstructor
//    public static class Config {
//        private String min;
//        private String max;
//    }
//
//}

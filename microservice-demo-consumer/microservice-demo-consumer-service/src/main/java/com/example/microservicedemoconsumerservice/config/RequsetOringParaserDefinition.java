package com.example.microservicedemoconsumerservice.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.RequestOriginParser;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 林世哲
 * @Data 2022/5/12 19:45
 * @Version 1.0
 */

//@Component： 标注Spring管理的Bean，使用@Component注解在一个类上，表示将此类标记为Spring容器中的一个Bean。
@Component
public class RequsetOringParaserDefinition implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        /**
         *
         * 定义从请求的什么地方获取来源信息
         * 比如我们可以要求所有的客户端需要在请求中携带来源幸喜
         */
        String serviceName = httpServletRequest.getParameter("serviceName");
        if (StringUtils.isEmpty(serviceName)) {
            throw new RuntimeException("serviceName is not empty");
        }
        System.out.println("我到这里咯！");
        return serviceName;
    }
}

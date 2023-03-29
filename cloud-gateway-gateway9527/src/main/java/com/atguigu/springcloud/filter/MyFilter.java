package com.atguigu.springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.lang.annotation.Annotation;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/20 21:41
 */
@Component
public class MyFilter implements GlobalFilter, Order {
    @Override
    //需要实现GloablFilter接口
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (username==null){
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            //设置HTTP错误码后选择拦截
            return exchange.getResponse().setComplete();
        }
        //放行
        return chain.filter(exchange);
    }
    //此处返回的数字代表优先级，数字越小优先级越大
    @Override
    public int value() {
        return 0;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

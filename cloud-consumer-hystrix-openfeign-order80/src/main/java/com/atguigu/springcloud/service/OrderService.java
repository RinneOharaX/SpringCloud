package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/18 1:02
 */
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT8001")
//设置调用的远程服务的名称以及设置回调方法的实现类
public interface OrderService {
    @GetMapping("/hystrix/payment/ok/{id}")
    public String PaymentInfo_Ok(@PathVariable("id") Integer id);

    @GetMapping("/hystrix/payment/timeout/{id}")
    public String PaymentInfo_TimeOut(@PathVariable("id") Integer id);

    @GetMapping("/hystrix/payment/circuitbreak/{id}")
    public String PaymentInfo_CircuitBreak(@PathVariable("id") Integer id);
}

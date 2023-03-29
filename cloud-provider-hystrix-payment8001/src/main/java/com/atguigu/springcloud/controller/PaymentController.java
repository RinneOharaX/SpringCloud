package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.serviceimp.PaymentServiceImp;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/18 0:42
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    public PaymentServiceImp paymentServiceImp;
    @GetMapping("/hystrix/payment/ok/{id}")
    public String PaymentInfo_Ok(@PathVariable("id") Integer id){
      return   paymentServiceImp.PaymentInfo_Ok(id);
    }

    @GetMapping("/hystrix/payment/timeout/{id}")
    public String PaymentInfo_TimeOut(@PathVariable("id")Integer id) throws InterruptedException {
        return  paymentServiceImp.PaymentInfo_TimeOut(id);
    }

    @GetMapping("/hystrix/payment/circuitbreak/{id}")
    public String PaymentInfo_CircuitBreak(@PathVariable("id") Integer id){
        return paymentServiceImp.PaymentInfo_CircuitBreaker(id);
    }


}

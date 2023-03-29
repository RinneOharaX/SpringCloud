package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.fallback.ConsumerFallback;
import com.atguigu.springcloud.service.ConsumerService;
import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Payment;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/27 15:24
 */
@RestController
@Slf4j
public class ServiceContorller {
    @Autowired
    public ConsumerService consumerService;


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        throw new RuntimeException("出现异常");
    }


    @PostMapping("/consumer/payment/create")
    public CommonResult<Long> createPayment(@RequestBody(required = false) Payment payment) {
        return consumerService.createPayment(payment);
    }
    @SentinelResource(value = "all",blockHandler = "allblock",fallback = "allfallback")
    @GetMapping("/consumer/payment/getall")
    public CommonResult<List<Payment>> getAllPayment() {
       throw new RuntimeException("抛出异常测试");
    }


    @GetMapping("/consumer/payment/port")
    public String getPort() {
        return consumerService.getPort();
    }

    public CommonResult<List<Payment>> allblock(BlockException blockException){

        return new CommonResult(444,"block熔断",null);
    }
    public CommonResult<List<Payment>> allfallback(){
        return new CommonResult(444,"fallback回调",null);
    }
}

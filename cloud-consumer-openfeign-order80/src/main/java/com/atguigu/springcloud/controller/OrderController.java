package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.feignservice.FeignService;
import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/17 15:47
 */
@Slf4j
@RestController
public class OrderController {
    @Autowired
    public FeignService feignService;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Long> create(Payment payment){
        return feignService.creat(payment);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        return feignService.getPaymentById(id);
    }
}

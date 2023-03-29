package com.atguigu.springcloud.controller;

import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/25 1:15
 */
@RestController
public class OrderController {
    @Resource
    public RestTemplate restTemplate;

    String url="http://cloudalibaba-provider-Payment";


    @GetMapping("/consumer/payment/getport")
    public String getPort(){
      return   restTemplate.getForObject(url+"/payment/port",String.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(url+"/paymenmt/get/"+id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/create")
    public CommonResult<Long> createPayment(@RequestBody(required = false) Payment payment){
        return restTemplate.postForObject(url+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getall")
    public CommonResult<List<Payment>> getAllPayment(){
        return restTemplate.getForObject(url+"/payment/getall",CommonResult.class);
    }
}

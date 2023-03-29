package com.atguigu.springcloud.service;

import com.atguigu.springcloud.fallback.ConsumerFallback;
import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "cloudalibaba-provider-Payment",fallback = ConsumerFallback.class)
@Service
public interface ConsumerService {
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);


    @PostMapping("/payment/create")
    public CommonResult<Long> createPayment(@RequestBody(required = false) Payment payment);

    @GetMapping("/payment/getall")
    public CommonResult<List<Payment>> getAllPayment();

    @GetMapping("/payment/port")
    public String getPort();


}

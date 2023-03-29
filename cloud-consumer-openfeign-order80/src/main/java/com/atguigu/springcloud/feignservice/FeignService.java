package com.atguigu.springcloud.feignservice;

import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface FeignService {
    @PostMapping("/payment/create")
    public CommonResult<Long> creat(@RequestBody Payment payment);

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}

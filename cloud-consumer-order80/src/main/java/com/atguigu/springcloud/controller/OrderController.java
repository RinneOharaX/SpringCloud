package com.atguigu.springcloud.controller;
import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/10 18:23
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/consumer/payment/create")
    public CommonResult<Long> createPayment(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    @GetMapping("/consumer/zipkin")
    public  String getZipkin(){

        return restTemplate.getForObject("http://localhost:8001"+"/zipkin",String.class);
    }

}

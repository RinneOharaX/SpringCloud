package com.atguigu.springcloud.configuration.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/12 17:17
 */
@RestController
@Slf4j
public class OrderController {
    public String URL="http://cloud-provider-zookeeper-payment8003";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/get/port")
    public  String getport(){
       return restTemplate.getForObject(URL+"/payment/get/port",String.class);
    }
}

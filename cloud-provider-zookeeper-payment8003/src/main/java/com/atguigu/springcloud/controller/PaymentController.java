package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/12 16:13
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String PORT;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment/get/port")
    public String getport(){
        return "当前服务的端口为:"+PORT+ UUID.randomUUID().toString();
    }
    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info(service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-provider-zookeeper-payment8003");
        return instances;
    }

}

package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/27 14:42
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SentinelService8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelService8401.class,args);
    }
}

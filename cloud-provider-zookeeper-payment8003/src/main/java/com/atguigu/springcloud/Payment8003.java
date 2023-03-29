package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/12 16:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8003 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8003.class,args);
    }
}

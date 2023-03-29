package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/24 14:14
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosPayment9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPayment9001.class,args);
    }
}

package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 14:30
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Seata2001 {
    public static void main(String[] args) {
        SpringApplication.run(Seata2001.class,args);
    }
}

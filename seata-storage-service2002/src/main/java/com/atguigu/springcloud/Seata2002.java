package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 15:50
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Seata2002 {
    public static void main(String[] args) {
        SpringApplication.run(Seata2002.class,args);
    }
}

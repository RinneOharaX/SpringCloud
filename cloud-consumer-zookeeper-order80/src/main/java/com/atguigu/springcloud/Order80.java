package com.atguigu.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/12 17:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order80 {
    public static void main(String[] args) {
        SpringApplication.run(Order80.class,args);

    }
}

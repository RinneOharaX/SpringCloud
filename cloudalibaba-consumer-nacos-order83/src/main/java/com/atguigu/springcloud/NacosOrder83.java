package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/25 1:08
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosOrder83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrder83.class,args);
    }
}

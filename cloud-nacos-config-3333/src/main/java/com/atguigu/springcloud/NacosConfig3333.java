package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/25 23:49
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfig3333 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfig3333.class,args);
    }
}

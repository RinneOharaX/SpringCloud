package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/18 0:31
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class HystrixPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPayment8001.class,args);
    }
}

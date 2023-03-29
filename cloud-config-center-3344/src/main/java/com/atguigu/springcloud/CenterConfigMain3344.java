package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/22 15:55
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CenterConfigMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(CenterConfigMain3344.class,args);
    }
}

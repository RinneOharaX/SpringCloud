package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/17 15:35
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignOrder80.class,args);
    }
}

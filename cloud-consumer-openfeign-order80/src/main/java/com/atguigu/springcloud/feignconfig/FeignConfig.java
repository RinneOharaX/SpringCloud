package com.atguigu.springcloud.feignconfig;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/17 16:04
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level create(){
        return Logger.Level.FULL;
    }
}

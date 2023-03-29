package com.atguigu.springcloud.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/10 18:15
 */
@Configuration
public class RestTemplateConfig {
    @Bean
//    @LoadBalanced
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}

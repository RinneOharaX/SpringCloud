package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/25 23:52
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    public String configinfo;

    @GetMapping("/get/config")
    public String getConfiginfo(){
        return configinfo;
    }
}

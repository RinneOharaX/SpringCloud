package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 18:38
 */
@Service
public interface AccountService {
    public void updateAccount(Long userId, BigDecimal money) throws InterruptedException;
}

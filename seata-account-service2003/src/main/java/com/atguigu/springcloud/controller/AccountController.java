package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.serviceimp.AccountServiceImp;
import com.atuguigu.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 18:40
 */
@RestController
@Slf4j
public class AccountController {
    @Autowired
    public AccountServiceImp accountServiceImp;

    @PostMapping("/account/update")
    public CommonResult<Integer> updateAccount(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money) throws InterruptedException {
        accountServiceImp.updateAccount(userId,money);
        return new CommonResult<>(200,"money扣减成功",null);
    }
}

package com.atguigu.springcloud.serviceimp;

import com.atguigu.springcloud.dao.AccountDao;
import com.atguigu.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 18:38
 */
@Service
public class AccountServiceImp implements AccountService {
    @Autowired
    public AccountDao accountDao;

    @Override
    public void updateAccount(Long userId, BigDecimal money) throws InterruptedException {
//        Thread.sleep(2000);
        accountDao.updateAccount(userId,money);
    }
}

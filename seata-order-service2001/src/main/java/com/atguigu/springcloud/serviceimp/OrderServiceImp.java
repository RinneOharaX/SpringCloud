package com.atguigu.springcloud.serviceimp;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;
import com.atuguigu.springcloud.entities.Order;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 15:24
 */
@Service
@Slf4j
public class OrderServiceImp implements OrderService {
    @Autowired
    public OrderDao orderDao;
    @Autowired
    public AccountService accountService;
    @Autowired
    public StorageService storageService;


    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void createOrder(Order order) {
        //创建订单
        orderDao.createOrder(order);
        log.info("-----创建订单成功-----");
        storageService.updateStorage(order.getProductId(),order.getCount());
        log.info("-----库存修改成功-----");
        accountService.updateAccount(order.getUserId(),order.getMoney());
        log.info("-----账户扣款成功-----");
    }

}

package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.serviceimp.OrderServiceImp;
import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 18:47
 */
@Slf4j
@RestController
public class OrderController {
    @Autowired
    public OrderServiceImp orderServiceImp;

    @GetMapping("/order/create")
    public CommonResult<Order> orderCreate(@RequestBody Order order){
        orderServiceImp.createOrder(order);
        return new CommonResult<>(200,"成功创建订单");
    }
}

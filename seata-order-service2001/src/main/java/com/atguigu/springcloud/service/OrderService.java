package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.OrderDao;
import com.atuguigu.springcloud.entities.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 15:21
 */
@Service
public interface OrderService {

    void createOrder(Order order);

}

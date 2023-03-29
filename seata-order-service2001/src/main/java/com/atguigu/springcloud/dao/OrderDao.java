package com.atguigu.springcloud.dao;

import com.atuguigu.springcloud.entities.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {
void createOrder(Order order);

 void updateOrder(@Param("id") Long id,@Param("status") Integer status);
}

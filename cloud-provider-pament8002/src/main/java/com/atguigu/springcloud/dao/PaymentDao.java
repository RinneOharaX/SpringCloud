package com.atguigu.springcloud.dao;

import com.atuguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public Long creat(@Param("payment") Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

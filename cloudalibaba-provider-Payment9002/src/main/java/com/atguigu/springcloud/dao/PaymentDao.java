package com.atguigu.springcloud.dao;

import com.atuguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PaymentDao {
    public Payment getPaymentById(Long id);

    public List<Payment> getAllPayment();

    public Long addPayment(@Param("payment") Payment payment);


}

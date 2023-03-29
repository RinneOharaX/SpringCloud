package com.atguigu.springcloud.service;

import com.atuguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/24 14:44
 */
@Service
public interface PaymentService {
    public Payment getPaymentById(Long id);

    public List<Payment> getAllPayment();

    public Long createPayment(Payment payment);

}

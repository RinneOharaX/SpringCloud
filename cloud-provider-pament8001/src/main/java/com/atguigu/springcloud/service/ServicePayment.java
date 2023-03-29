package com.atguigu.springcloud.service;
import com.atuguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public interface ServicePayment {
    public Long creat(Payment payment);

    public Payment getPaymentById(Long id);
}

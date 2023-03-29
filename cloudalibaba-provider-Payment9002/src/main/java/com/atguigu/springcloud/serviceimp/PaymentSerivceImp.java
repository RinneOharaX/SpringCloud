package com.atguigu.springcloud.serviceimp;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.service.PaymentService;
import com.atuguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/24 14:47
 */
@Service
public class PaymentSerivceImp implements PaymentService {
    @Autowired
    public PaymentDao paymentDao;
    @Override
    public Payment getPaymentById(Long id) {
       return paymentDao.getPaymentById(id);
    }

    @Override
    public List<Payment> getAllPayment() {
        return paymentDao.getAllPayment();
    }

    @Override
    public Long createPayment(Payment payment) {
       return paymentDao.addPayment(payment);
    }
}

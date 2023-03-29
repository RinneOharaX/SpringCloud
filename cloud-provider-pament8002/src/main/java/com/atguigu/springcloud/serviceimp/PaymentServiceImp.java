package com.atguigu.springcloud.serviceimp;
import com.atguigu.springcloud.dao.PaymentDao;

import com.atguigu.springcloud.service.ServicePayment;
import com.atuguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/10 14:49
 */
@Service
public class PaymentServiceImp implements ServicePayment {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public Long creat(Payment payment) {
        return paymentDao.creat(payment);
    }


    @Override
    public Payment getPaymentById(Long id) {
       return paymentDao.getPaymentById(id);
    }
}

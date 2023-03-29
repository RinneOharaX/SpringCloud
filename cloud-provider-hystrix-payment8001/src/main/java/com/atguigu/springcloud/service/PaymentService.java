package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    //创建两个方法，一个是直接调用方法，一个是延迟调用
    public String PaymentInfo_Ok(Integer id);

    public String PaymentInfo_TimeOut(Integer id) throws InterruptedException;

    public String PaymentInfo_CircuitBreaker(Integer id);
}

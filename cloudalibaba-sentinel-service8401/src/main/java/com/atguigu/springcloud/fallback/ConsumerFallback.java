package com.atguigu.springcloud.fallback;

import com.atguigu.springcloud.service.ConsumerService;
import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/27 14:52
 */
@Component
public class ConsumerFallback implements ConsumerService {
    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return new CommonResult<>(444,"getPaymentById失败,执行回调",null);
    }

    @Override
    public CommonResult<Long> createPayment(Payment payment) {
        return new CommonResult<>(444,"createPayment失败,执行回调",null);
    }

    @Override
    public CommonResult<List<Payment>> getAllPayment() {
        return new CommonResult<>(444,"getAllPayment失败,执行回调",null);
    }

    @Override
    public String getPort() {
        return "getPort失败，执行回调";
    }
}

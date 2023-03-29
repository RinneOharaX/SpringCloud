package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.serviceimp.PaymentSerivceImp;
import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/24 14:49
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    public String port;
    @Autowired
    public PaymentSerivceImp serivceImp;
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = serivceImp.getPaymentById(id);
        return new CommonResult<>(200,"查询数据成功",payment);
    }
    @PostMapping("/payment/create")
    public CommonResult<Long> createPayment(@RequestBody(required = false) Payment payment){
        Long result = serivceImp.createPayment(payment);
        if (result>0){
            return new CommonResult<>(200,"成功创建Payment",result);
        }else{
            return new CommonResult<>(405,"创建失败",result);
        }
    }
    @GetMapping("/payment/getall")
    public CommonResult<List<Payment>> getAllPayment(){
        return new CommonResult<>(200,"成功查询所有Payment",serivceImp.getAllPayment());
    }
    @ResponseBody
    @GetMapping("/payment/port")
    public String getPort(){
        return port;
    }

}

package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.serviceimp.PaymentServiceImp;
import com.atuguigu.springcloud.entities.CommonResult;
import com.atuguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/10 14:57
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentServiceImp paymentServiceImp;

    @Value("${server.port}")
    private String PORT;

    @PostMapping("/payment/create")
    public CommonResult<Long> creat(@RequestBody Payment payment){
        Long result=paymentServiceImp.creat(payment);

       if (result>0){
           return new CommonResult<Long>(200,"成功插入数据,端口号为"+PORT,result);
       }else
           return new CommonResult<Long>(444,"插入数据失败",null);
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment result=paymentServiceImp.getPaymentById(id);
        if (result!=null){
            return new CommonResult<Payment>(200,"成功查询数据,端口号为"+PORT,result);
        }else{
            return new CommonResult<Payment>(444,"未查询到数据",null);
        }
    }
}

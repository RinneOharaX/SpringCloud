//package com.atguigu.springcloud.serviceimp;
//
//import com.atguigu.springcloud.service.OrderService;
//import org.springframework.stereotype.Component;
//
///**
// * @PROJECT_NAME: SpringCloud
// * @DESCRIPTION:
// * @USER: Administrator
// * @DATE: 2023/3/18 14:56
// */
//
////实现消费端的接口，专门设置处理fallback的类
//@Component
//public class OrderServiceFallbackImp implements OrderService {
//    @Override
//    public String PaymentInfo_Ok(Integer id) {
//        return "(｡•ˇ‸ˇ•｡) 对不起，PaymentInfo_Ok出现异常，请稍后再试";
//    }
//
//    @Override
//    public String PaymentInfo_TimeOut(Integer id) {
//        return "(｡•ˇ‸ˇ•｡) 对不起，PaymentInfo_TimeOut出现异常，请稍后再试";
//    }
//
//    @Override
//    public String PaymentInfo_CircuitBreak(Integer id) {
//        return "(｡•ˇ‸ˇ•｡) 对不起，PaymentInfo_CircuitBreak出现异常，请稍后再试";
//    }
//}

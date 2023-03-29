package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/18 1:04
 */
@RestController
@Slf4j
public class OrderController {
    @Resource
    public OrderService orderService;

    @GetMapping("/consumer/hystrix/payment/ok/{id}")
    public String PaymentInfo_Ok(@PathVariable("id") Integer id){
        return orderService.PaymentInfo_Ok(id);
    };

    @GetMapping("/consumer/hystrix/payment/timeout/{id}")
    public String PaymentInfo_TimeOut(@PathVariable("id")Integer id){
        return orderService.PaymentInfo_TimeOut(id);
    };


////该属性用来没置在燎动时间窗中，断路器熔断的最小请求数。例如，默认该值为20的时候,
////如果滚动时间窗(默以10秒)内仅收到了19个请求，即使这19个请求都失败了， 断路器也不会打开。
//@HystrixProperty(name = " circuitBreaker . requestVolumeThreshold", value = "20"),
////该属性用来没置在燎动时间窗中，表示在熔动时间窗中，在请求数量超过
//// circuitBreaker. requestVolumeThreshold的情况下，如果错误请求数的百分比超过50,
////就把断路器没置为”打开”状态，否则就设置为"关闭”状态。
//@HystrixProperty(name = "circuitBreaker . errorThresholdPercentage", value = "50"),
////该属性用来没置当断路器打开之后的休眠时间窗。休眠时间窗结束之后,
////会将断路器置为"半开”状态，尝试熔断的请求命令，如果依然失败就将断路器继续设置为”打开”状态,
////如果成功就没置为"关闭”状态。
//@HystrixProperty(name = "circuitBreaker . sleepWindowinMilliseconds", value = "5000"),
    @GetMapping("/consumer/hystrix/payment/circuitbreak/{id}")
    public  String PaymentInfo_CircuitBreak(@PathVariable("id") Integer id){
        return orderService.PaymentInfo_CircuitBreak(id);
    }

    public String CircuitBreak_FallBack(Integer id){
        return  "出现异常，可能发生服务熔断，请注意！";
    }
}

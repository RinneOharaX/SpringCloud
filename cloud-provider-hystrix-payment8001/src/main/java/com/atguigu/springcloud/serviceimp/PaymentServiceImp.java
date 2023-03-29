package com.atguigu.springcloud.serviceimp;

import com.atguigu.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/18 0:37
 */
@Service
//@DefaultProperties(defaultFallback = "PaymentInfo_GlobalError")
//全局备用方法，如果某个方法出现异常，并且那个方法未指定备用方法，则调用全局的默认备用方法
public class PaymentServiceImp implements PaymentService {
    @Override
//    @HystrixCommand
    //即使使用全局方法，也必须使用    @HystrixCommand来监控方法，否则无法捕捉到异常调用至备用方法
    public String PaymentInfo_Ok(Integer id) {
        int a=10/0;
        //主动设置异常，测试全局备用方法
        return "当前线程为："+Thread.currentThread().getName()+"id为"+id+"无延迟调用O(∩_∩)O";
    }

    @Override
//    @HystrixCommand(fallbackMethod = "PaymentInfo_Error",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
//    })
    //设置允许2秒超时时间，如果超出则调用备用方法
//    @HystrixCommand
    public String PaymentInfo_TimeOut(Integer id) throws InterruptedException {
        int sleeptime= 3;
        //设置沉睡3秒，则必定超时，测试备用方法

        Thread.sleep(sleeptime*1000);
        return "当前线程为："+Thread.currentThread().getName()+"id为"+id+"延迟调用"+sleeptime+"秒O(∩_∩)O";
    }

    @Override
    @HystrixCommand(fallbackMethod ="CircuitBreak_FallBack",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String PaymentInfo_CircuitBreaker(Integer id) {
        if (id<0){
            throw new RuntimeException("数值为负数，出现异常");
        }else {
            return "线程名:"+Thread.currentThread().getName()+"流水号为:"+UUID.randomUUID().toString();
        }
    }
    public String CircuitBreak_FallBack(Integer id){
        return  "出现异常，可能发生服务熔断，请注意！";
    }
    //备用方法的参数列表与返回值必须要与原方法一致，否则hystrix无法找到备用方法
    public String PaymentInfo_Error(Integer id){
        return "(｡•ˇ‸ˇ•｡) 对不起，服务调用超时或者出现异常，请稍后再试";
    }
    //全局异常则不需要参数，否则也会找不到全局的备用方法
    public String PaymentInfo_GlobalError(){
        return "(｡•ˇ‸ˇ•｡) 对不起，出现全局异常，请稍后再试";
    }
}

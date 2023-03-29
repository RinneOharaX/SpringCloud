package com.atguigu.springcloud.service;

import com.atuguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Service
@FeignClient("seata-account-service")
public interface AccountService {
    @PostMapping("/account/update")
    CommonResult<Integer> updateAccount(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}

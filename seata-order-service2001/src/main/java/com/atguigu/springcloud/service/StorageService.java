package com.atguigu.springcloud.service;

import com.atuguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient("seata-storage-service")
public interface StorageService {
    @PostMapping("/storage/update")
    CommonResult<Integer> updateStorage(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}

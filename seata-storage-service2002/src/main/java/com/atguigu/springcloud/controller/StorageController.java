package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.serviceimp.StorageServiceImp;
import com.atuguigu.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 18:21
 */
@RestController
@Slf4j
public class StorageController {
    @Autowired
    public StorageServiceImp storageServiceImp;

    @PostMapping("/storage/update")
    public CommonResult<Integer> updateStorage(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        storageServiceImp.updateStorage(productId,count);
        return new CommonResult(200,"库存扣减成功",null);
    }
}

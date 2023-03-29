package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 18:16
 */
@Service
public interface StorageService {
    void updateStorage(Long productId,Integer count);
}

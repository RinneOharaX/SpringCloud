package com.atguigu.springcloud.serviceimp;

import com.atguigu.springcloud.dao.StorageDao;
import com.atguigu.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/28 18:18
 */
@Service
public class StorageServiceImp implements StorageService {
    @Autowired
    public StorageDao storageDao;

    @Override
    public void updateStorage(Long productId, Integer count) {
        storageDao.updateStorage(productId,count);
    }
}

package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {
    public Long updateStorage(@Param("productId") Long productId,@Param("count")Integer count);
}

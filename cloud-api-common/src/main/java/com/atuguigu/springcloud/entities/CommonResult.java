package com.atuguigu.springcloud.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/10 14:01
 */
//@JsonSerialize(using = ComparableSerializer.class)
//@JsonDeserialize(using = ComparableDeserializer.class)
public class CommonResult<T> {
    public CommonResult(Integer code, String message, T type) {
        this.code = code;
        this.message = message;
        this.type = type;
    }

    public CommonResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    private Integer code;
    private  String message;
    private T type;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}

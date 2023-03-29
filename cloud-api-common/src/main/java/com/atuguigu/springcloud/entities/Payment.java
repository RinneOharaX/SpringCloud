package com.atuguigu.springcloud.entities;

import lombok.*;

import java.io.Serializable;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/10 13:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Payment implements Serializable {
    private  Long id;
    private  String serial;
}

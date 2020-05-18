package com.wangyiran.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: spring-cloud-alibaba-learning
 * @description:
 * @author: Wang Yiran
 * @create: 2020-05-19 01:34
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}

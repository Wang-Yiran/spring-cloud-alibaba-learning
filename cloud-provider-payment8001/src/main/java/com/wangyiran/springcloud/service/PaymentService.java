package com.wangyiran.springcloud.service;

import com.wangyiran.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: spring-cloud-alibaba-learning
 * @description:
 * @author: Wang Yiran
 * @create: 2020-05-19 01:48
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

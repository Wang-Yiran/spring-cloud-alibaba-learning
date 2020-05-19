package com.wangyiran.springcloud.dao;

import com.wangyiran.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: spring-cloud-alibaba-learning
 * @description:
 * @author: Wang Yiran
 * @create: 2020-05-19 01:38
 **/
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

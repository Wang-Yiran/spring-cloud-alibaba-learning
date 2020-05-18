package com.wangyiran.springcloud.service;

import com.wangyiran.springcloud.dao.PaymentDao;
import com.wangyiran.springcloud.entity.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: spring-cloud-alibaba-learning
 * @description:
 * @author: Wang Yiran
 * @create: 2020-05-19 01:49
 **/
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

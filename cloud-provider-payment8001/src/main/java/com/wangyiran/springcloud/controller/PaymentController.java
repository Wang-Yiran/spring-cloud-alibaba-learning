package com.wangyiran.springcloud.controller;

import com.wangyiran.springcloud.entity.CommonResult;
import com.wangyiran.springcloud.entity.Payment;
import com.wangyiran.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: spring-cloud-alibaba-learning
 * @description:
 * @author: Wang Yiran
 * @create: 2020-05-19 01:51
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果:{}",result);
        if(result > 0) {
            return new CommonResult<Integer>(200, "OK", result);
        } else {
            return new CommonResult(400, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果:{}", payment);
        if(payment != null) {
            return new CommonResult<Payment>(200, "OK", payment);
        } else {
            return new CommonResult(400, "没有对应记录", id);
        }
    }

}

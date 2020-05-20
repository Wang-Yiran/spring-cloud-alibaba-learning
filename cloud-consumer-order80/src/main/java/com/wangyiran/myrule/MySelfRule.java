package com.wangyiran.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MySelfRule
 * @description: Ribbon负载均衡配置类
 * @author: XZQ
 * @create: 2020/3/7 14:42
 **/
@Configuration
public class MySelfRule {

    /**
     * 负载算法
     * @return
     */
//    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}

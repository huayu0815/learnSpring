package com.huayu.study.learnSpring.extendTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by zhaohuayu on 17/4/14.
 */
public class BeanPostProcessorTest implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("开始实例化" + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("实例化结束" + beanName);
        return bean;
    }
}

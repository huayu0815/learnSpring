package com.huayu.study.learnSpring.factoryBeanTest;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by zhaohuayu on 17/4/10.
 */
public class Application {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("factoryBean.xml"));
        System.out.println(JSON.toJSONString(beanFactory.getBean("car")));
    }
}

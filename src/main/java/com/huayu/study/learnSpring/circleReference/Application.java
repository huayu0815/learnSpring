package com.huayu.study.learnSpring.circleReference;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by zhaohuayu on 17/4/10.
 */
public class Application {

    public static void main(String[] args) {
        try {
            BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("circleReferenceTest.xml"));

            System.out.println(beanFactory.getBean("testA").toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

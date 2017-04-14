package com.huayu.study.learnSpring.extendTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by zhaohuayu on 17/4/10.
 */
public class Application {

    public static void main(String[] args) {


        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("extend.xml"));
        //BeanFactoryAwareTest test = (BeanFactoryAwareTest)beanFactory.getBean("awareTest") ;
        //test.testAway();


        /**
         * BeanPostProcess需要自己add到BeanFactory的beanPostProcessors(List)里边
         */
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("extend.xml"));
        beanFactory.addBeanPostProcessor(new BeanPostProcessorTest());
        BeanFactoryAwareTest test = (BeanFactoryAwareTest)beanFactory.getBean("awareTest") ;
        test.testAway();

        /**
         * BeanPostProcess会自动注册到BeanFactory的beanPostProcessors(List)里边
         */
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("extend.xml") ;
        Hello hello = (Hello)ctx.getBean("hello");
        hello.say();*/
    }
}

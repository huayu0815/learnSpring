package com.huayu.study.learnSpring.extendTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Created by zhaohuayu on 17/4/14.
 */
public class BeanFactoryAwareTest implements BeanFactoryAware {

    private BeanFactory beanFactory ;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory ;
    }

    public void testAway() {
        Hello hello = (Hello) beanFactory.getBean("hello") ;
        hello.say();
    }

}

package com.huayu.study.learnSpring.extendTest;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by zhaohuayu on 17/4/14.
 */
public class Hello implements InitializingBean{


    public void initMethod() {
        System.out.println("init method");
    }

    public void destroyMethod() {
        System.out.println("destroy method");
    }

    public void say() {
        System.out.println("hello");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}

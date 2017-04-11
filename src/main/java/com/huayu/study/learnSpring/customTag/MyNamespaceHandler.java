package com.huayu.study.learnSpring.customTag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by zhaohuayu on 17/4/11.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}

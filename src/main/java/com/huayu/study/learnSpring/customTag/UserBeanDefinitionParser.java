package com.huayu.study.learnSpring.customTag;

import com.huayu.study.learnSpring.common.bo.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Created by zhaohuayu on 17/4/11.
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    protected Class getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String userName = element.getAttribute("userName") ;
        String email = element.getAttribute("email") ;

        if (StringUtils.hasText(userName)) {
            bean.addPropertyValue("userName", userName) ;
        }
        if (StringUtils.hasText(email)) {
            bean.addPropertyValue("email", email) ;
        }
    }
}

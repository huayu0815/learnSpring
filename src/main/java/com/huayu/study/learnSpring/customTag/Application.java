package com.huayu.study.learnSpring.customTag;

import com.huayu.study.learnSpring.common.bo.User;
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
       /* ApplicationContext bf = new ClassPathXmlApplicationContext("customTag.xml") ;
        User user = (User)bf.getBean("testBean") ;
        System.out.println(user.getUserName() + "___" + user.getEmail());*/

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("customTag.xml"));
        System.out.println(beanFactory.getBean("testBean").toString());
    }
}

package com.simple.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Map;

public class SimpleBeans {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleBeans.class);


    String beanName;
    List<String> listOfNames;
    Map<String,String> MapOfBean;
    String[]arrayOfBean;
    int intOfBean;
    double doubleOfBean;



    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext
                ("simpleBeans.xml");
        ContructorInjectName sb=context.getBean("simpleBeans",ContructorInjectName.class);
        SimpleBeans sbx=context.getBean("simpleBeanx",SimpleBeans.class);
        InitMethod InitMethod=context.getBean(InitMethod.class);
        DestructorBean DestructorBean=context.getBean(DestructorBean.class);
        context.registerShutdownHook();
        context.close();
    }

    public void setBeanName(String beanName) {
        this.beanName=beanName;
    }
}

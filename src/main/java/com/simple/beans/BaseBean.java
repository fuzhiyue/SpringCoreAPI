package com.simple.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class BaseBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseBean.class);


    String beanName;
    List<String> listOfNames;
    Map<String,String> MapOfBean;
    String[]arrayOfBean;
    int intOfBean;
    double doubleOfBean;



    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("simpleBeans.xml");
        ContructorInjectName sb=context.getBean("simpleBeans",ContructorInjectName.class);
        BaseBean sbx=context.getBean("simpleBeanx", BaseBean.class);
        InitMethod InitMethod=context.getBean(InitMethod.class);
    }

    public void setBeanName(String beanName) {
        this.beanName=beanName;
    }
}

package com.simple.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

public class DestructorBean implements DisposableBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(DestructorBean.class);


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
        DestructorBean sbx=context.getBean("simpleBeanx", DestructorBean.class);
        InitMethod InitMethod=context.getBean(InitMethod.class);
    }

    public void setBeanName(String beanName) {
        this.beanName=beanName;
    }

    @Override
    public void destroy() throws Exception {
        LOGGER.info("DisposableBean destroy method called");
    }
    public void XMLdestroyMethod() throws Exception {
        LOGGER.info("XMLdestroyMethod destroy method called");
    }
    @PreDestroy
    public void preDestry() throws Exception {
        LOGGER.info("PreDestroy destroy method called");
    }
}

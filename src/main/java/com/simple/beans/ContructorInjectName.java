package com.simple.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class ContructorInjectName {

    public ContructorInjectName(String beanName, List<String> listOfNames, Map<String, String> mapOfBean, String[] arrayOfBean, int intOfBean, double doubleOfBean) {
        this.beanName = beanName;
        this.listOfNames = listOfNames;
        MapOfBean = mapOfBean;
        this.arrayOfBean = arrayOfBean;
        this.intOfBean = intOfBean;
        this.doubleOfBean = doubleOfBean;
    }

    String beanName;
    List<String> listOfNames;
    Map<String,String> MapOfBean;
    String[]arrayOfBean;
    int intOfBean;
    double doubleOfBean;



    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("simpleBeans.xml");
        ContructorInjectName sb=context.getBean("simpleBeans", ContructorInjectName.class);
    }
}

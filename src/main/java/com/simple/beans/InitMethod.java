package com.simple.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InitMethod implements InitializingBean,  BeanNameAware {
    private String initFiled;
    private static final Logger LOGGER = LoggerFactory.getLogger(InitMethod.class);
    void setInitFiled(){
        this.initFiled="initMethodCalled";
        LOGGER.info("init method called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("InitializingBean afterPropertiesSet method called");
    }
    @PostConstruct
    public void PostConstruct() throws Exception {
        LOGGER.info("PostConstruct destroy method called");
    }

    @Override
    public void setBeanName(String s) {
        LOGGER.info("BeanNameAware setBeanName method called with parameter:"+s);
    }
}

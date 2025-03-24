//package com.example.bookstarter;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.stereotype.Component;
//
//@Component
//public class BeanPostProcessorImpl implements BeanPostProcessor {
//
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("Starter postProcessBeforeInitialization for bean <" + bean + "> with beanName = " + beanName);
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("Starter postProcessAfterInitialization for bean <" + bean + "> with beanName = " + beanName);
//        return bean;
//    }
//
//}

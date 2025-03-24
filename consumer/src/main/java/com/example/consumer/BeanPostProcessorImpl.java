package com.example.consumer;

import com.example.bookstarter.Book;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorImpl implements BeanPostProcessor {

    //Из стартера не работает...

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Book book) {
            System.out.println("Consumer postProcessBeforeInitialization for book bean: " + book);
            System.out.println("Consumer postProcessBeforeInitialization for bean <" + bean + "> with beanName = " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Book book) {
            System.out.println("Consumer postProcessAfterInitialization for book bean: " + book);
            System.out.println("Consumer postProcessAfterInitialization for bean <" + bean + "> with beanName = " + beanName);
        }
        return bean;
    }

}

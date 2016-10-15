package com.spring.hello;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;



public class initHelloWorld implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName)throws BeansException {
		System.out.println("Before Initialization : " + beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {		
		System.out.println("After Initialization : "+beanName);
		return bean;
	}
	
}

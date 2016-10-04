package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.util.Animal;
import com.spring.util.Elephant;

public class ServiceMain {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("app-config.xml");
		
		Animal anm = (Animal)beanFactory.getBean("animal");
		System.out.println(anm);
		Elephant ele = (Elephant)beanFactory.getBean("elephant");
		System.out.println(ele);
		
		
	}
}

package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.inventory.Order;

public class ServiceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("app-config.xml");
		Order ord = (Order)beanfactory.getBean("orderBean");
		System.out.println(ord);
	}

}

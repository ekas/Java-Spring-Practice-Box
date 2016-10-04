package com.spring.Service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.util.Country;

public class ServiceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("app-config.xml");
		
		
		Country cou =(Country)beanFactory.getBean("country");
		cou.setCountryName("India");
		System.out.println(cou.getCountryName());
		
		
		Country cou2 =(Country)beanFactory.getBean("country");
		System.out.println(cou2 .getCountryName());
		
	}

}

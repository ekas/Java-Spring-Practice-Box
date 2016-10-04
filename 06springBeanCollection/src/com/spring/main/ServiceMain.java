package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collection.ListProperties;

public class ServiceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("app-config.xml");		
		ListProperties listAll = (ListProperties)beanFactory.getBean("shapeCollection");
		System.out.println(listAll.toString());
	}

}

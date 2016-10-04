package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.info.Person;

public class ServiceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("app-config.xml");
		Person per = (Person)beanFactory.getBean("person");
		System.out.println(per.toString());
	}

}

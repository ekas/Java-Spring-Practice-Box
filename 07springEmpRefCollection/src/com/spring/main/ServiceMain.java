package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.util.Employee;

public class ServiceMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("app-config.xml");
		Employee emp = (Employee) beanFactory.getBean("emp");
		System.out.println(emp.toString());
	}

}

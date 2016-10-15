package com.spring.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hello.HelloWorld;

public class HelloTest{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		System.out.println("After xml Read");
		HelloWorld hw =(HelloWorld)context.getBean("helloWorld");
		System.out.println("After getting bean");
		hw.getMessage();		
	}
}

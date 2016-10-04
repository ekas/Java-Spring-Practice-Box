package com.springtest.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springtest.beans.speaks;

public class springTest {
	public static void main(String[] args) {
		
		System.out.println("Initiating Bean Factory");
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("app-config.xml"));
		speaks speak = (speaks)factory.getBean("cat");
		speak.talk();
	}
}

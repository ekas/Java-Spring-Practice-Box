package com.spring.util;

public class Animal {
	private String name = null;
	private int age = 0;

	public Animal() {
		super();
	}	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "\nAnimal [name=" + name + ", age=" + age + "]";
	}	
}

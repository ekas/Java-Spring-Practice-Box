package com.spring.util;

public class Elephant extends Animal{
	private String location = null;
	
	public Elephant() {
		super();
	}	
	public Elephant(String location) {
		super();
		this.location = location;
	}
	public String getLocation() {
		return location;
	}	
	public void setLocation(String location) {
		this.location = location;
	}
	public String toString() {
		return "\nElephant [location=" + location + getName()+ getAge()+"]";
	}	
}

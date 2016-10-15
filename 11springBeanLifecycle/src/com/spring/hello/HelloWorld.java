package com.spring.hello;

public class HelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("Bean is Init()");
	}
	
	public void destroy(){
		System.out.println("Bean is Destroy()");
	}
}

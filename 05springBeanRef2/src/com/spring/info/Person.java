package com.spring.info;

public class Person {
	private String firstName = null;
	private String lastName = null;
	private Address address = null;
	
	public Person() {
		super();
	}
	
	public Person(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [Name: " + firstName + " " + lastName+ "]"
				+ "\n"+ address.toString() ;
	}	
}

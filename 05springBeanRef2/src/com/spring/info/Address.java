package com.spring.info;

public class Address {
	private String city = null;
	private String buildNo = null;
	private String street = null;
	
	public Address() {
		super();
	}
	public Address(String city, String buildNo, String street) {
		super();
		this.city = city;
		this.buildNo = buildNo;
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBuildNo() {
		return buildNo;
	}
	public void setBuildNo(String buildNo) {
		this.buildNo = buildNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	@Override
	public String toString() {
		return "Address [" + buildNo + ","+ street + "," + city+"]";	
	}
	
}

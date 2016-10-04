package com.spring.util;

public class EmpAddress {
	private String buildNo = null; 
	private String street = null;
	private String city = null;
	
	public EmpAddress() {
		super();
	}

	public EmpAddress(String buildNo, String street, String city) {
		super();
		this.buildNo = buildNo;
		this.street = street;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "EmpAddress:\nbuildNo=" + buildNo + ", street=" + street
				+ ", city=" + city;
	}	
}

package com.spring.util;

public class Country {
	private String countryName = null;

	public Country() {
		super();
	}

	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}

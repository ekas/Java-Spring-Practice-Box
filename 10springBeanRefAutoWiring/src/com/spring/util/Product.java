package com.spring.util;

public class Product {
	private String prodName = null;
	private int price = 0;
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", price=" + price + "]";
	}
	
}

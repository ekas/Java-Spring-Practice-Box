package com.spring.util;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {
	private int orderId = 0;
	
	//@Autowired
	private Product product;
	private int qty = 0;
	
	
	public Order() {
		super();
	}
	/*
	@Autowired*/
	public Order(Product product) {
		super();
		this.product = product;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getTotalPrice() {
		return qty*product.getPrice();
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + ", qty="
				+ qty + ", TotalPrice=" + getTotalPrice()+"]";
	}
	
	
	
}

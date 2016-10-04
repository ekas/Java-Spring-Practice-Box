package com.spring.inventory;

public class Order {

	private String orderName = null;
	private String productName = null;
	private int qty = 0;
	private int price = 0;
	
	
	public Order() {
		super();
	}
	
	public Order(String orderName, String productName, int qty, int price) {
		super();
		this.orderName = orderName;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getTotalPrice(){
		return qty * price;		
	}
	
	@Override
	public String toString() {
		return "Order Details:\n"+ "Order Name: "+ getOrderName()+"\n"+"Product: "+getProductName()+"\n"+
				"Total Price: " + getTotalPrice();
	}
}

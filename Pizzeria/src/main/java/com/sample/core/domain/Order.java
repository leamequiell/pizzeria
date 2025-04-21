package com.sample.core.domain;

import java.util.List;

public class Order {
	private List<Pizza> pizza;
	private String nameCustomer;
	private String direction;
	private Boolean pending;
	private Boolean pendingDelivery;
	private Boolean onTheWay;
	private Boolean orderDelibered;
	private Boolean notDelivered;
	//hola mumdo dsdasasd
	public Order() {
		super();
	}

	public Order(List<Pizza> pizza, String nameCustomer, String direction, Boolean pending, Boolean pendingDelivery,
			Boolean onTheWay, Boolean orderDelibered, Boolean notDelivered) {
		super();
		this.pizza = pizza;
		this.nameCustomer = nameCustomer;
		this.direction = direction;
		this.pending = pending;
		this.pendingDelivery = pendingDelivery;
		this.onTheWay = onTheWay;
		this.orderDelibered = orderDelibered;
		this.notDelivered = notDelivered;
	}

	public void markAsPeding() {
		
	}
	public void markAsPendingForDelivery() {
		
	}
	public void markAsOnTheWay() {
		
	}
	public void markAsOrderDelivered() {
		
	}
	public void markAsNotDelivered() {
		
	}
	
	
	public List<Pizza> getPizza() {
		return pizza;
	}

	public void setPizza(List<Pizza> pizza) {
		this.pizza = pizza;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Boolean getPending() {
		return pending;
	}

	public void setPending(Boolean pending) {
		this.pending = pending;
	}

	public Boolean getPendingDelivery() {
		return pendingDelivery;
	}

	public void setPendingDelivery(Boolean pendingDelivery) {
		this.pendingDelivery = pendingDelivery;
	}

	public Boolean getOnTheWay() {
		return onTheWay;
	}

	public void setOnTheWay(Boolean onTheWay) {
		this.onTheWay = onTheWay;
	}

	public Boolean getOrderDelibered() {
		return orderDelibered;
	}

	public void setOrderDelibered(Boolean orderDelibered) {
		this.orderDelibered = orderDelibered;
	}

	public Boolean getNotDelivered() {
		return notDelivered;
	}

	public void setNotDelivered(Boolean notDelivered) {
		this.notDelivered = notDelivered;
	}
	
	

}

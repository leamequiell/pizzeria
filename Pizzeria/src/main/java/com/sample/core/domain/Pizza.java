package com.sample.core.domain;

public class Pizza {
	private int id;
	
	private int precio;
	
	private String description;
	
	public Pizza() {
		super();
	}

	public Pizza(int id, int precio, String description) {
		super();
		this.id = id;
		this.precio = precio;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}

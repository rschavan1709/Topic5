package com.neosoft.lifecycle;

import javax.annotation.*;

public class Vadapav {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Vadapav() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vadapav [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method");
	}
}

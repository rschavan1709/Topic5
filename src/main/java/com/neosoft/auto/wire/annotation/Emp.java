package com.neosoft.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Inside setter");
		this.address = address;
	}

	public String getData() {
		return address.getCity();
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Inside Constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}

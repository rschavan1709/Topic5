package com.neosoft.ci;

public class Person {
	private int personId;
	private String name;
	private Certi certi;
	
	public Person(int personId, String name,Certi certi) {
		super();
		this.personId = personId;
		this.name = name;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", certiName=" + certi.name +"]";
	}
	
}

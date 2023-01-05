package com.neosoft.ci;

import java.util.DoubleSummaryStatistics;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor: double, double");
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int, int");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor: String, String");
	}
	
	public void doSum() {
		System.out.println("value of a and b is:"+a+" "+b);
		System.out.println("Sum is: " +(this.a+this.b));
	}
	
	
}

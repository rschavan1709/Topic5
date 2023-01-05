package com.neosoft.lifecycle;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");
	
//	 Samosa samosa=(Samosa) context.getBean("s1"); System.out.println(samosa);
	 
	context.registerShutdownHook();
	/*
	 * Pepsi pepsi=(Pepsi) context.getBean("p1"); System.out.println(pepsi);
	 */
	
	Vadapav v1=(Vadapav) context.getBean("v1");
	System.out.println(v1);
	}
}

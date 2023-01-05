package com.neosoft.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/neosoft/auto/wire/annotation/autowireConfig.xml");
		Emp emp = context.getBean(Emp.class);
		System.out.println(emp);
		System.out.println(emp.getData());
		System.out.println(emp.getAddress().getCity());
		
	}
	
}

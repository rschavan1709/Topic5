package com.neosoft.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neosoft.ref.A;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	Person p=(Person) context.getBean("person");
	System.out.println(p);
	Addition a=(Addition) context.getBean("Add");
	a.doSum();
}
}
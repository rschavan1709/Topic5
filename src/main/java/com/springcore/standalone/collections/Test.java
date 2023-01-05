package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neosoft.ref.A;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneConfig.xml");
	Person person = (Person) context.getBean("person");
	System.out.println(person);
	System.out.println(person.getMyBestFriends());
	System.out.println(person.getFeeStructure());
	System.out.println(person.getMyBestFriends().getClass());
	System.out.println(person.getFeeStructure().getClass());
}
}

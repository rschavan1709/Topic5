package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereo/stereoConfig.xml");
		Student student = context.getBean("s1",Student.class);
		System.out.println(student.hashCode());
		//System.out.println(student);
		//System.out.println(student.getAddresses());
		//System.out.println(student.getAddresses().getClass().getName());
		 
		Student student2 = context.getBean("s1",Student.class);
		System.out.println(student2.hashCode());
		//System.out.println(student2.hashCode());
		
		
		/*
		 * Teacher t1 = (Teacher) context.getBean("teacher"); Teacher t2 = (Teacher)
		 * context.getBean("teacher");
		 * 
		 * System.out.println(t1.hashCode()); System.out.println(t2.hashCode());
		 */
		
		
	}
}

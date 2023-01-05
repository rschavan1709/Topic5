package com.neosoft.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
	Samosa samosa = (Samosa) context.getBean("getSamosa");
	System.out.println(samosa);
	samosa.display();
	
	
}
	
}

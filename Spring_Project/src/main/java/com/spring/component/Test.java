package com.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("componentConfig.xml");
		Student s = context.getBean("stud", Student.class);
		System.out.println(s);
	}
}

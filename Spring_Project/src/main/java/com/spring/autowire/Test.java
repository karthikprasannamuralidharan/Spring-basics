package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autoconfig.xml");
		Employee e = context.getBean("emp", Employee.class);
		System.out.println(e.getAddress().getCity()+" "+e.getAddress().getStreet());
		
		Address a = context.getBean("address", Address.class);
		System.out.println(a);
	}

}

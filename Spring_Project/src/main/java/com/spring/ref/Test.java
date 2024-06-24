package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
		A objA = (A) context.getBean("refA");
		System.out.println(objA.getX() +" "+objA.getObjB().getY());
		System.out.println(objA);
		
		B objB = (B) context.getBean("refB");
		System.out.println(objB.getY());
	}

}

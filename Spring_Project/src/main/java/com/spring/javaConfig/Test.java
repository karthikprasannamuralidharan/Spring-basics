package com.spring.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.component.JavaStudent;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Student s = context.getBean("getStudent", Student.class);
        JavaStudent j = context.getBean("getJavaStudent", JavaStudent.class);
        s.info();
        j.course();
        
        
    }
}

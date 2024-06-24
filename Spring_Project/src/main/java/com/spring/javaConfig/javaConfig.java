package com.spring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.component.JavaStudent;

@Configuration

public class javaConfig {
	
	@Bean
	public JavaStudent getJavaStudent() {
		return new JavaStudent();
	}
	@Bean
	public Student getStudent() {
		return new Student(getJavaStudent());

	}

}

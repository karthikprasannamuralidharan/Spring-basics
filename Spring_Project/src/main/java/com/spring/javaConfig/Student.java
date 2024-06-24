package com.spring.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.component.JavaStudent;

public class Student {

	private String studentName;
	private String city;
	private JavaStudent javaStudent;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(JavaStudent javaStudent) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.javaStudent = javaStudent;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", javaStudent=" + javaStudent + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public JavaStudent getJavaStudent() {
		return javaStudent;
	}

	public void setJavaStudent(JavaStudent javaStudent) {
		this.javaStudent = javaStudent;
	}

	public void info() {
		System.out.println("Hello Students!");
	}

}

package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Setter injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("constructor");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

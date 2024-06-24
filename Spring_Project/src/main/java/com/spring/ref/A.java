package com.spring.ref;

public class A {
	private int x;
	private B objB;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObjB() {
		return objB;
	}
	public void setObjB(B objB) {
		this.objB = objB;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int x, B objB) {
		super();
		this.x = x;
		this.objB = objB;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", objB=" + objB + "]";
	}
	
	

}

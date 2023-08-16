package com.finalDemo;

public class Demo1 {

	final String name = "java";
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		
		d.name ="selenium";
		d.testLogin();
	}
	
	
	final void testLogin() {
		System.out.println("This is final method.");
	}
}

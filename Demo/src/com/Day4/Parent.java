package com.Day4;

public class Parent {

	
	String name ="parentString";
	
	public static void testlogin() {
		
		System.out.println("this is test login from parent class.");
	}
	
	private void testLogin2() {
		System.out.println("this is private method.");
	}
	
	protected void testLogin3() {
		System.out.println("Hey i am protected method from parent class.");
	}

	 public void testLogin4() {
		System.out.println("Hey i am protected method from parent class.");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.testLogin2();
		
		
	}
}

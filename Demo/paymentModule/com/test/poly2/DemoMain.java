package com.test.poly2;

public class DemoMain {

	
	public static void main(String[] args) {
		
		Derived1 d1 = new Derived1();
		d1.login(); //which method
		
		Base1 d2 = new Derived1();
		d2.login(); // which method
		
		
		Base1 d3 = new Base1();
		d3.login(); //which method
		
	}
}

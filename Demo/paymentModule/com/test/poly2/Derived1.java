package com.test.poly2;
//child class
public class Derived1 extends Base1{
	@Override
	public void login() {
		System.out.println("this is from derived class.");
	}
	
	public static void main(String[] args) {
		Derived1 d1 = new Derived1();
	}
	

}

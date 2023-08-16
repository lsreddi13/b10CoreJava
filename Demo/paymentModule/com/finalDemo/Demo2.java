package com.finalDemo;

public class Demo2 extends Demo3 {

//	void testLogin() {
//		System.out.println("This is final method.");
//	}

	public static void main(String[] args) {
		Demo1 dd = new Demo1();
		dd.testLogin();

		Demo2 ddd = new Demo2();
		ddd.testLogin();
	}

}

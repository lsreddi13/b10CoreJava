package com.Day4;

public class DemoThis {

	//
	int courseDuration;	int a; // declaration
	String name;
	public static void main(String[] args) {
		DemoThis dt = new DemoThis();
		
		
		dt.test(10, "selenium");
		System.out.println(dt.a); // 0
		System.out.println(dt.name); // null
		
		DemoThisOfThis dtt = new DemoThisOfThis();
		dtt.testClass(9);
		
	}
	
	
	public void test(int a, String name) {
		a = a;
		name = name;
	}
	
	
	
	
}

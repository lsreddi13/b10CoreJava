package com.Day1;

public class DemoClass2 {

	//static var
	static int count1 = 30;
	
	//instance var
	int count2 = 31;
	
	
	public void test1() {
		System.out.println("Hey i am test1 method.");
	}
	
	public static void test2() {
		System.out.println("hey i am static method test2.");
	}
	
	
	public static void main(String[] args) {
		
		//local var
		int count3 = 33;
		
		
		System.out.println(count1);
		
		System.out.println(count3);
		
		
		DemoClass2 qq = new DemoClass2();
		System.out.println(qq.count2);
		
		qq.test1();
		
		
		test2();
		
		
	}


}

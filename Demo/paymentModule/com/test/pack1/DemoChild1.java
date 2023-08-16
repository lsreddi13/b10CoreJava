package com.test.pack1;

public class DemoChild1 extends DemoDefault{

	
	
	public static void main(String[] args) {
		
		DemoChild1 dc = new DemoChild1();
		
		String str1 = dc.name;
		System.out.println("string avlue : "+ str1);
		
		
		dc.test1();
		
		dc.test2();
		
		dc.test3();
		

	}
}

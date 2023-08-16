package com.test.oops;

public class DemoMain extends DemoMaths{

	
	
	
	
	public void div(int a, int b) {
		System.out.println("This is division.");
	}
	public static void main(String[] args) {
		
		DemoMain dm = new DemoMain();
		
		System.out.println("after adding two valeus : "+dm.add(2,3));
		int x = dm.add(2,3);
		System.out.println("This is after adding two values : "+ x);
//		dm.add(21,31);
//		dm.add(9, 10);
		
//		dm.sub();
//		
//		
//		dm.mul();
//		
//		dm.div();
//		
		
	}
}

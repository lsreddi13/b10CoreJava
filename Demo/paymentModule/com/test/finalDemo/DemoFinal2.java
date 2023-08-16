package com.test.finalDemo;

public class DemoFinal2 extends DemoFinal1 {
	
	String city = "hyd";
	
	public void testhome() {
		System.out.println("this is public method.");
	}
	final String name = "java"; //vars, data members
	

	public static void testAdmin() {
		System.out.println("this is final method");
	}
	
//	final void testlogin() {
//		System.out.println("this is final method");
//	}
	
	public static void main(String[] args) {
		DemoFinal2 df2 = new DemoFinal2();
		
		System.out.println(df2.city);
		
		System.out.println(df2.name);
		
//		System.out.println();
		
		df2.testlogin();
		
		df2.testhome();
	}
}

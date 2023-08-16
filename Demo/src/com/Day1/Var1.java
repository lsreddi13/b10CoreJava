package com.Day1;

public class Var1 {

	
	int sal1 = 100000; // instance var

	static int sal3 = 300000; // static var
	
	public void login() {

		int sal2 = 200000; // local var
		System.out.println(sal2); // print local var

	}

	public void test2() {
		System.out.println(sal1);
		
		System.out.println(sal3);
		
		
//		System.out.println(sal2);
	
	}

	public static void main(String[] args) {
		//
		System.out.println("Nothing");
		System.out.println(sal3);
		
		Var1 ref = new Var1(); //object creteion for this class
				
		ref.login();
		System.out.println(ref.sal1);
	}
	
}

//compile - JVM Java Virtual Machine

//run - JVM Java Virtual Machine
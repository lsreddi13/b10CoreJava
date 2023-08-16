package com.Day3;

public class DemoMethod2 {

	// non void type method. return type method.
	public int testSum() {
		int a = 30;
		int b = 20;
		System.out.println("Hey i am non void type method");
		int sum = a + b;
		return sum;
	}

//	public boolean test5() {
//		boolean a;
//		int marks = 30;
//		if (marks >= 35) {
//			a = true;
//
//		} else {
//			a = false;
//		}
//		return a;
//	}
	
	
	public static boolean test6() {
		boolean a;
		int marks = 30;
		if (marks >= 35) {
			a = true;

		} else {
			a = false;
		}
		return a;
	}
	
	
//	what is the use of static ?
//			after access specified will declare the static keywork.
	
	

	public static void main(String[] args) {

		DemoMethod2 ss = new DemoMethod2();
		int total = ss.testSum();
		System.out.println("total value " + total);

//		boolean value = ss.test5();
		boolean value = test6();
		System.out.println("value from method " + value);

	}

}

package com.Day3;

public class DemoMethod1 {

//	static and nonstatic

	static int a = 10;

	int b = 10;

	// non static method.
	public void test1() {
		System.out.println("Hey i am non static method.");
	
	}

	// non void type method. return type method.
//	public double test3() {
//		System.out.println("Hey i am non void type method");
//		return 3;
//	}
	
	// non void type method. return type method.
		public double testSum() {
			
			int a = 10;
			int b = 20;
			System.out.println("Hey i am non void type method");
			
			int sum = a + b;
			return sum;
		}

	// static method.
	public static void test2() {
		System.out.println("Hey i am static method.");
	}

	public static void main(String[] args) {
		System.out.println(a);

		DemoMethod1 ss = new DemoMethod1();

		System.out.println(ss.b);

		ss.test1();

		double total = ss.testSum();
		System.out.println("total value "+ total);
		
//		System.out.println(ss.test3());
		
		test2();

	}

}

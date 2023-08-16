package com.encapsulation;

public class DemoException1 {

	public static void main(String[] args) {

		System.out.println("hello JAVA");

		DemoException1 de1 = new DemoException1();
		de1.test(1, 0);
	}

	public void test(int x, int y) {

		if (x / y > 0) {
			System.out.println("hello");
		} else {
			throw new ArithmeticException("this is error found..");
		}

//		for(int i=x; i<y; i++) {
//			System.out.println("i value :"+i);
//		}

	}

}

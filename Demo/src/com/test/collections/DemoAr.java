package com.test.collections;

public class DemoAr {

	public void printStuID(int id) {
		System.out.println("print stu id : " + id);
	}

	public void printFruits(String str) {
		System.out.println("Fruit name : " + str);
	}

	public static void main(String[] args) {

		String fruits[] = { "banana", "apple", "pineapple", "grapes", "mango", "123" };// array is group of elements
																						// with same data type. array is
																						// a fixed size

//		int ar[] = { 123, 124, 125, 126, 127 };

		DemoAr da = new DemoAr();

		for (int i = 0; i < fruits.length; i++) {
			da.printFruits(fruits[i]);
		}
//		for (int i = 0; i < ar.length; i++) {
//
//			da.printStuID(ar[i]);
//
//		}

	}

}

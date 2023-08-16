package com.Day3;

public class DemoMath {

	public int maxValue(int i, int j) {

		int a = i;
		int b = j;
		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return max;
	}

	public int maxValue2(int i, int j) {

		int a = i;
		int b = j;
		int max = (a > b) ? a : b;
		return max;
	}

	public static void main(String[] args) {

		int a = Math.max(44, 7); //java predefined funciton or method
		System.out.println(a);

		DemoMath dm = new DemoMath(); // user defined funciton / method.
		int value = dm.maxValue2(150, 16);

		System.out.println(value);

	}

}

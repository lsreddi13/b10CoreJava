package com.test.collections;

import java.util.Arrays;

public class REvIntArray {
	public static void main(String[] args) {
		int[] a1 = { 10, 20, 30, 40, 50 };

		int[] a2 = new int[a1.length];

		for (int i = 0; i < a2.length; i++) {

			a2[a1.length - 1 - i] = a1[i];

		}

		System.out.println("A1 Array values : " + Arrays.toString(a1));
		System.out.println("A2 array valies : " + Arrays.toString(a2));

	}
}

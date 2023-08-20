package com.test.collections;

import java.util.Arrays;

public class DemoSortAr {

	public static void main(String[] args) {
		
		int  x = 5, y=10;
		System.out.println("X value : "+ x + ", Y Value : "+ y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("X value after swap : "+ x + ", Y Value after swap : "+ y);
			
		
		int[] a = {113,41,15,7,8,2,45,23,32,54,17,87,98,56};
		
//		S1A2I3 = T2B3J4
	
//		Arrays.sort(a);
		
		Arrays.sort(a, 3, 10);
		
		//swap two numbers without third var?
		
		
		if(a[0]> a[a.length-1]) {
			int temp  =a[0]; 
			a[0] = a[a.length-1];
			 a[a.length-1] = temp;
			 
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
}

package com.RegEx;

import java.util.regex.Pattern;

public class Ex1 {

	String s1 = "Welcome Rani";
	String s2 = "Welcome Mounica";
	String s3 = "Welcome Harini";
	String s4 = "Welcome Jhanshi";

//	String result = "About 3,790 results (0.47 seconds) ";

	// fetch from About 8,64,00,000 results (0.51 seconds)

//	result count = 3790
	// timetaken = 0.47;

	public static void main(String[] args) {

		String result = "About 3,790 results (0.47 seconds) ";
		String[] ar = result.split(" ");

		String newstr = ar[1].replaceAll("[^0-9]", "");

		String newstr2 = ar[3].replaceAll("[^0-9]", "");

//		for(int i =0; i<ar.length; i++) {
//			System.out.println(ar[i]);
//		}

		System.out.println("number of results : " + newstr);
		System.out.println("Time taken : " + newstr2);
		Ex1 e = new Ex1();
		e.testLogin("Rani", 9);
		e.testLogin("Mounica", 8);
		e.testLogin("Harini", 9);
		e.testLogin("Jhanshi", 6);

		String st = "Welcome Mounica,1"; //
		
		int x = st.length();
		
		char s1 = st.charAt(x-1);
		System.out.println(s1);
		
		
	}

	public void testLogin(String x, int val) {
		String username = x;
		System.out.println("Welcome " + username + "," + val);
	}

}

package com.test.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoListExamples {

	public static void main(String[] args) {

		ArrayList<String> li1 = new ArrayList<>();

		ArrayList<String> li2 = new ArrayList<>(Arrays.asList("dddd", "SSS"));

//		ArrayList<String> li3 = new ArrayList<String>() {
//			{
//				add("Geeks");
//				add("for");
//				add("Geeks");
//			}
//		};
		li1.add("dfasdF");
		li1.add("eeee");
		li1.add("wref");
		li1.add("adsft");
		li1.add("mgh");

//		System.out.println(li1);
//		li2.addAll(0, li1);
		
		li2.addAll(0, li1);
		System.out.println(li2);
		System.out.println(li2.contains("eeee"));
		
		if(li2.contains("mgh")) {
			System.out.println("doo");
			
		}
		
	

	}

}

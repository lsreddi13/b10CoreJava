package com.test.collections;

import java.util.ArrayList;
import java.util.List;

public class DemoList1 {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();
		
		li.add("java1");
		li.add("python2");
		li.add("java3");
		li.add("python4");
		li.add("java5");
		li.add("python");
		li.add("java7");
		li.add("python8");
		li.add("java9");
		li.add("python20");

//		System.out.println(li.isEmpty());

		System.out.println(li.size());

//		for (String s : li) {
//			System.out.println(s);
//		}
		

		System.out.println("index of python : " + li.indexOf("python"));

		int removeableitem = li.indexOf("python");
		
		li.remove(removeableitem);
		System.out.println(li.size());
//
//		for (String s : li) {
//			System.out.println(s);
//		}
	}

}

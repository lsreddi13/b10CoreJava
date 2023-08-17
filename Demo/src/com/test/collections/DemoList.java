package com.test.collections;

import java.util.ArrayList;

public class DemoList {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> li = new ArrayList<>();
		li.add("Mounika");
		li.add("laxmi");
		li.add("laxmi1");
		System.out.println(li.size());
		
//		for (String string : li) {
//			System.out.println(string);
//		}
		
//		System.out.println(li.get(0) + "------------------");
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		
		
		
//		String[] st = new String[10];
//		st[9] = "Mounika";
//		st[10] = "Mounika";
//		
//		System.out.println(st.length);
		
		
		
	}

}

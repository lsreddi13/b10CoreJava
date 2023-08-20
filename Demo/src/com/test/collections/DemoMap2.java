package com.test.collections;

import java.util.HashMap;
import java.util.Map;

public class DemoMap2 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();

		m.put(1, "apple");
		m.put(2, "apple");
		m.put(3, "apple2");
		System.out.println("M List");
		System.out.println(m);
		Map<Integer, String> m2 = new HashMap<>();

		m2.put(1, "banana");
		m2.put(2, "grapes");
		m2.put(3, "cherries");
		System.out.println("M2 List : ");
		System.out.println(m2);

		
		System.out.println("going to merge two maps");
		
		m.putAll(m2);
		
		System.out.println(m);
		
		
	}
}

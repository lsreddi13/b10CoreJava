package com.test.collections;

import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {

	public static void main(String[] args) {

		int i = 10;

		Hashtable<Integer, String> hs = new Hashtable<>();
		hs.put(1, "Hari");
		hs.put(2, "Hari");
		hs.put(3, "Hari");
		hs.put(4, "Hari");

	
		for (Map.Entry m : hs.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		hs.remove(1);
	
	
		for (Map.Entry m : hs.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}

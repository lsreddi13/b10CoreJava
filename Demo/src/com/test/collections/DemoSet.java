package com.test.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class DemoSet {

	public void removeEleSet(Set<String> ss, String sk) {
		ss.remove(sk);
	}

	public void addElemetSet(Set<String> ss, String sk) {
		ss.add(sk);
	}
	
	public static void main(String[] args) {

		DemoSet ds = new DemoSet();

		HashMap<String, String> cs = new HashMap<>();
		cs.put("india", "sss");
		
		cs.put("ws", "sss");
		
		cs.put(null, "sssdd");
		cs.put(null, "sss");
		cs.put("india", "sss");
		cs.put("india", "sss");
		
		HashSet<String> states = new HashSet<String>();

		System.out.println(states);

//		HashSet<String> unitatories = new HashSet<String>();
		states.add("Andrapradesh");
		states.add("TL");
		states.add("TN");

//		states.removeAll(states);
		System.out.println(states);
		System.out.println(states.size());

//		for (String state : states) {
//			System.out.println(state);
//		}
//		System.out.println("***********************");
//
//		ds.addElemetSet(unitatories, "GOA");
//		ds.removeEleSet(states, "Andrapradesh");
//		ds.addElemetSet(states, "Telangana");
//		ds.addElemetSet(states, "Andhra");
//
//		System.out.println(states.size());
//
//		for (String state : states) {
//			System.out.println(state);
//		}
	}
}

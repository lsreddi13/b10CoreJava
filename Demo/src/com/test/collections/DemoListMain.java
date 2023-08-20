package com.test.collections;

import java.util.ArrayList;
import java.util.List;

public class DemoListMain {

	public static void main(String[] args) {

		DemoListMain dm = new DemoListMain();

				
		List<String> fruitsList = new ArrayList<>();
		fruitsList.add("apple");
		fruitsList.add("banana");
		fruitsList.add("cherries");

		
		
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
		
		

		int indexValue = dm.findIndexOfListElement(li, "python20");
		System.out.println(indexValue);
		dm.addElementToList("Goroovy", fruitsList );
		System.out.println(li.size());
		System.out.println("size of fruits list before : " + fruitsList.size());
		dm.addElementToList( "grapes", fruitsList);

		System.out.println("size of fruits list after : " + fruitsList.size());
	}

	public int findIndexOfListElement(List<String> li, String s) {
		return li.indexOf(s);
	}

	public void addElementToList(String s, List<String> li) {

		li.add(s);
	}

}

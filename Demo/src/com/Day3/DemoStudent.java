package com.Day3;

public class DemoStudent {
	int id;
	String name;
	
	
	public void stuData(int stuId, String stuName) {
		id = stuId;
		name = stuName;
		
		
	}
	
	public void displayStudentInformation() {
		System.out.println(id);
		System.out.println(name);
	}
	
	

}

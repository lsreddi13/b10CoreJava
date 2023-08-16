package com.Day4;

public class DemoMethods {

	
	//all types of method
	
	public static String add() {
		
		
		return "selenium";
	}
	
	
	
	
//	how do you pas values through method.
	
	
	public void testLogin(String username, String password) {
		
		System.out.println("Enter username : "+ username);
		
		
		System.out.println("Enter password : "+ password);
		
	}
	
	public static void main(String[] args) {
		
		DemoMethods dm = new DemoMethods();
		dm.testLogin("java", "selenium");
		
	}
	
}

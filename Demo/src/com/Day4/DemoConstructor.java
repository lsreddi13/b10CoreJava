package com.Day4;

public class DemoConstructor {

	//this is called a constructors - non arguement constructor.
	public DemoConstructor() {
		System.out.println("this is constructor");
	}
	
	public DemoConstructor(String username1, String password1) {
		System.out.println("this is method."+ username1 + password1);
	}
	
	public static void login() {
		System.out.println("this is method.");
	}
	
	
	public static void testLogin(String username, String password) {
		System.out.println("this is method."+ username +" - "+ password);
	}
	
	public static void main(String[] args) {
	
		
		DemoConstructor obj2 = new DemoConstructor("admin1", "admin1234");
		login();
		
		testLogin("admin", "admin123");
		
	}
	
}

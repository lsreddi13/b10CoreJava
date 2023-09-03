package com.seleniumt.testng;

import org.testng.annotations.Test;

public class PIMTEST {
	/*
	 * test login and logout functionality. 
	 */
	
	@Test
	public void testLoginLogout() {
		System.out.println("open browser");
		System.out.println("open app login apge"); 
		System.out.println("enter user name and pwd and click login");
		System.out.println("verify dashboard page");
		System.out.println("click logout");
				
	}
	
	@Test
	public void testCreatePIM() {
		System.out.println("open browser");
		System.out.println("open app login apge");
		System.out.println("enter user name and pwd and click login");
		System.out.println("verify dashboard page");
		System.out.println("click PIM tab");
		System.out.println("click add button");
		System.out.println("enter user info");
		System.out.println("click save button");
		System.out.println("search and verify user");
		System.out.println("click logout");
				
	}
	
	@Test
	public void testEditPIM() {
		System.out.println("open browser");
		System.out.println("open app login apge");
		System.out.println("enter user name and pwd and click login");
		System.out.println("verify dashboard page");
		System.out.println("click PIM tab");
		System.out.println("search and verify user");
		System.out.println("update user info");
		System.out.println("click save button");
		System.out.println("search and verify user");
		System.out.println("click logout");
				
	}
	
	@Test
	public void testDeletePIM() {
		System.out.println("open browser");
		System.out.println("open app login apge");
		System.out.println("enter user name and pwd and click login");
		System.out.println("verify dashboard page");
		System.out.println("click PIM tab");
		System.out.println("search and verify user");
		System.out.println("click delete icon");
		System.out.println("accept confirmation popup");
		System.out.println("search and verify user");
		System.out.println("click logout");
				
	}

}

package com.seleniumt.testng;

import org.testng.annotations.Test;

public class JOBTest {
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
	public void testCreateJOB() {
		System.out.println("open browser");
		System.out.println("open app login apge");
		System.out.println("enter user name and pwd and click login");
		System.out.println("verify dashboard page");
		System.out.println("click admin tab");
		System.out.println("click add button");
		System.out.println("enter JOB info");
		System.out.println("click save button");
		System.out.println("search and verify JOB");
		System.out.println("click logout");
				
	}
	
	@Test
	public void testEditJOB() {
		System.out.println("open browser");
		System.out.println("open app login apge");
		System.out.println("enter user name and pwd and click login");
		System.out.println("verify dashboard page");
		System.out.println("click admin tab");
		System.out.println("search and verify JOB");
		System.out.println("update JOB info");
		System.out.println("click save button");
		System.out.println("search and verify JOB");
		System.out.println("click logout");
				
	}
	
	@Test
	public void testDeleteJOB() {
		System.out.println("open browser");
		System.out.println("open app login apge");
		System.out.println("enter user name and pwd and click login");
		System.out.println("verify dashboard page");
		System.out.println("click admin tab");
		System.out.println("search and verify JOB");
		System.out.println("click delete icon");
		System.out.println("accept confirmation popup");
		System.out.println("search and verify JOB");
		System.out.println("click logout");
				
	}

}

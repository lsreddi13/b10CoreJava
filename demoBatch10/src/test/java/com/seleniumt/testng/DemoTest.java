package com.seleniumt.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {
	/*
	 * test login and logout functionality.
	 */
	@AfterClass
	public void clsoeBrowser() {
		System.out.println("close browser");
	}

	@BeforeClass
	public void launchApp() {
		System.out.println("open browser");
		System.out.println("open app login apge");

	}

	@BeforeMethod
	public void setUp() {
		System.out.println("enter user name and pwd and click login");
	}

	@AfterMethod
	public void logout() {
		System.out.println("click logout");

	}
	

	@Test(priority = 0, invocationCount=10)
	public void testCreateUser() {
		System.out.println("verify dashboard page");
		System.out.println("click admin tab");
		System.out.println("click add button");
		System.out.println("enter user info");
		System.out.println("click save button");
		System.out.println("search and verify user");
		Assert.assertEquals(false, false);

	}

	@Test(priority = 2, dependsOnMethods = "testEditUser", enabled = false)
	public void testDeleteUser() {

		System.out.println("verify dashboard page");
		System.out.println("click admin tab");
		System.out.println("search and verify user");
		System.out.println("click delete icon");
		System.out.println("accept confirmation popup");
		System.out.println("search and verify user");

	}

	@Test(priority = 1, dependsOnMethods = "testCreateUser", alwaysRun= true, description = "i am doing p[ractige here......", enabled = false)
	public void testEditUser() {

		System.out.println("verify dashboard page");
		System.out.println("click admin tab");
		System.out.println("search and verify user");
		System.out.println("update user info");
		System.out.println("click save button");
		System.out.println("search and verify user");

	}

}

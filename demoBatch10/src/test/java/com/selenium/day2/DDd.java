package com.selenium.day2;

import org.testng.annotations.Test;

public class DDd extends Base{

	String url = "https://www.facebook.com/";


	@Test
	public void testBrowser() {
		selectBrowser("chrome");
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		
		
		
		
		
		
		
		
		
		System.out.println("Print page title : "+ pageTitle);
		closeBrowser();
		
	}
	

}



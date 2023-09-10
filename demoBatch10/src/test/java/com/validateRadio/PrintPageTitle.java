package com.validateRadio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * 
 */
public class PrintPageTitle {
	@Test
	public void printPageTitle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		// getTitle() to obtain page title
		System.out.println("Page title is : " + driver.getTitle());
		driver.close();
	}
}

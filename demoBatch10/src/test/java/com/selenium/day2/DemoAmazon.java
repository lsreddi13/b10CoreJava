package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAmazon {
	
	String url = "https://www.amazon.in/";
	@Test
	public void testLinkText() {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("pagetitle : "+ driver.getTitle());
		System.out.println("current page url : "+ driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Canada")).click();
		
		System.out.println("After clicking on canada link");
		
		System.out.println("pagetitle : "+ driver.getTitle());
		System.out.println("current page url : "+ driver.getCurrentUrl());
		
		
	
//		
	}

}

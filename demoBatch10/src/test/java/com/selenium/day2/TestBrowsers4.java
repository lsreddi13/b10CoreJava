package com.selenium.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBrowsers4 {
	 WebDriver cc;
	
	
	@Test
	public void testChrome() {
		 cc = new ChromeDriver();
		 cc.get("http://www.fb.com");
		 
		String pagetitle =  cc.getTitle();
		System.out.println(pagetitle);
		 
	}
	
	@Test
	public void testEdge() {
		 cc = new EdgeDriver();
		 cc.get("http://www.google.com");		 
		String pagetitle =  cc.getTitle();
		System.out.println(pagetitle);
		 
	}
	
	@Test
	public void testFirefox() {
		 cc = new FirefoxDriver();
		 cc.get("http://www.gmail.com");		 
		String pagetitle =  cc.getTitle();
		System.out.println(pagetitle);
		 
	}

}


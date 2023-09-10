package com.ohrm.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoParallel2 {

	@Test
	public void testEenadu() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.eenadu.net");
	}
	
	@Test
	public void testSakshi() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.sakshi.com");
	}

	
	@Test
	public void testGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	

	@Test
	public void testYahoo() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
	}

}

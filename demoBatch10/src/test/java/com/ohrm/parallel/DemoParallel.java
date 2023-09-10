package com.ohrm.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoParallel {
	WebDriver driver;

	@BeforeClass
	public void t() {
		driver = new ChromeDriver();

	}

	@Test
	public void testEenadu() {

		driver.get("http://www.eenadu.net");
	}

	@Test
	public void testSakshi() {

		driver.get("http://www.sakshi.com");
	}

	@Test
	public void testGoogle() {

		driver.get("http://www.google.com");
	}

	@Test
	public void testYahoo() {
		
		driver.get("http://www.yahoo.com");
	}

}

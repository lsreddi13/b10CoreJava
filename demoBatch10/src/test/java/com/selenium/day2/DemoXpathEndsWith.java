package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoXpathEndsWith {
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[starts-with(@href, 'ttps://www.facebook.com/recover/initiate/')]")).click();
		
	}

}

package com.ohrm.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoFrame {

	@Test
	public void testAlerts() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		

//		driver.switchTo().frame("frame1");
		
		
		String text = driver.findElement(By.xpath("//h1")).getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

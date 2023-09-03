package com.ohrm.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAlerts {

	@Test
	public void testAlerts() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("alertButton")).click();
//		
//		//alert class
//		//What is alert?
//		
//		Alert a = driver.switchTo().alert();
//		a.accept();
		
		
		driver.findElement(By.id("promtButton")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("hello");
		a.accept();
		
		
		
	}
	
}

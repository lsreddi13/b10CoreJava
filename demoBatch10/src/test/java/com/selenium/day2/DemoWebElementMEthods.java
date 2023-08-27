package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class DemoWebElementMEthods {

	@Test
	public void test() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.fb.com");

//		WebElement u_name = driver.findElement(By.id("email"));
//		WebElement u_pwd = driver.findElement(By.id("pass"));
		
		
//		
//		// webelement methods
//		u_name.sendKeys("fdasdf");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		u_name.clear();
//		// clear
//		u_name.sendKeys("dddddd");
		String v = driver.findElement(By.name("login")).getCssValue("color");
		
//	
		 System.out.println(Color.fromString(v).asHex());
	
		
//		driver.findElement(By.name("login")).click();
		
		
		

	}
	//print button color
	
	

}

package com.ohrm.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoOffSet {
	@Test
	public void test() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");

		// Store 'Gmail' anchor web element
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		// Capture x and y offset positions of element
//		int xOffset = gmailLink.getRect().getX();
//		int yOffset = gmailLink.getRect().getY();
//		
//		System.out.println("x : "+xOffset + " - y :"+yOffset);
		Actions actionProvider = new Actions(driver);
		// Performs mouse move action onto the offset position
//		actionProvider.moveByOffset(xOffset, yOffset).build().perform();
		
		actionProvider.moveToElement(gmailLink).build().perform();
		
		
	}

}

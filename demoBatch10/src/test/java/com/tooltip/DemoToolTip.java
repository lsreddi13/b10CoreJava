package com.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoToolTip {
	@Test
	public void printToolTip() {
		String baseUrl = "http://demo.guru99.com/test/tooltip.html";
		String expectedTooltip = "What's new in 3.2";
		ChromeDriver driver = new ChromeDriver();

		driver.get(baseUrl);

		WebElement we = driver.findElement(By.id("download_now"));
		
//		WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
		Actions action = new Actions(driver);

		action.moveToElement(we).build().perform();

		WebElement we2 = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
	

		System.out.println("Actual Title of Tool Tip  " + we2.getText());
	}
	
	
	
}

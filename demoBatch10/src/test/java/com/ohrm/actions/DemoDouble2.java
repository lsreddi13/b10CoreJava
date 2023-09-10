package com.ohrm.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoDouble2 {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement we = driver.findElement(By.xpath("//button[contains(text(), 'Double-Click Me To See Alert')]"));
		WebElement we2 = driver.findElement(By.xpath("//button[contains(text(), 'Double-Click Me To See Alert')]"));
		
		Actions ac = new Actions(driver);
		
		ac.doubleClick(we).build().perform();
		
		ac.contextClick(we2).build().perform();
		
	}
}

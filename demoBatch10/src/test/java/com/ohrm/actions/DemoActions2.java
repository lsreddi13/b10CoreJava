package com.ohrm.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoActions2 {
	
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		WebElement ele = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
//		What is benefits of actions class
		
		
		
		
		Actions abc = new Actions(driver); // class
		
		abc.moveToElement(ele).build().perform();
		
		
//		print all links from your account
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@id='nav-al-your-account']/a"));
		
		
		System.out.println(li.size());
		
		for (WebElement we : li) {
			
			String name = we.getText();
			System.out.println(name);
			
		}
		
	}

}

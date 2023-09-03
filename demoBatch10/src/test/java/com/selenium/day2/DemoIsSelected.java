package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoIsSelected {

	@Test
	public void testIsSelected() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/checkbox");

		WebElement cbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']/.."));

		System.out.println(cbox.isDisplayed());

		System.out.println(cbox.isEnabled());
		
		System.out.println(cbox.isSelected());
		
		if (cbox.isSelected()) {
			System.out.println("already selected");
		} else {
			System.out.println("not yet selected");
			cbox.click();
		}

		WebElement cbox2 = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		System.out.println(cbox2.isSelected());

	}
}

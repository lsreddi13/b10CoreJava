package com.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoIsSelected {

	// true / false - boolean

	@Test
	public void testLogin() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/web/inputs.html");

		boolean value = driver.findElement(By.name("checkbox_input")).isSelected();
		driver.findElement(By.name("checkbox_input")).click();
		boolean value2 = driver.findElement(By.name("checkbox_input")).isSelected();

		System.out.println(value);

		System.out.println(value2);

	
		
		
		
		
		
	}

}

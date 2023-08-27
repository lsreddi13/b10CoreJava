package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoGetAttribute {

	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	public void testLinkText() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		WebElement user_name = driver.findElement(By.name("username"));

//		What is the return type of findelements? 
		
//		What is the return type of getAttribute
		
//		print all the input box count from fb login apge
//		
//		print all input placeholder text
				
//		print plaveholder value
		String str1 = user_name.getAttribute("Pfflaceholder");

		System.out.println(str1);

		String str2 = user_name.getAttribute("class");

		System.out.println(str2);

//		driver.findElement(By.name("username")).sendKeys("fasdf");

	}

}

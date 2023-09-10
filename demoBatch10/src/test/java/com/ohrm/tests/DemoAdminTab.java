package com.ohrm.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoAdminTab {

	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	public void testAdminTab() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// object explicit wait
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get(url);

		// enter user name
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));

		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter pasword
		driver.findElement(By.name("password")).sendKeys("admin123");
		// click login
		// ref obj we can use it
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"))
				.click();

	//click admin tab
		
		
	}

}

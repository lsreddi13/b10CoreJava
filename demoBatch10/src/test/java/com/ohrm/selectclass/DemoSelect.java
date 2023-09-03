package com.ohrm.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoSelect {

	/*
	 * working with select list items in create new facebook user
	 */
	@Test
	public void testCreateNewUser() throws InterruptedException {

		// open fb login page
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// click create new account
		WebElement createAccount_ele = driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]"));
		createAccount_ele.click();
		Thread.sleep(3000);

		// click month list
		WebElement month_list_ele = driver.findElement(By.name("birthday_month"));

//		month_list_ele.isDisplayed();
		// use selenium select class
//		Select se = new Select(month_list_ele);
//		se.selectByIndex(0);

//		se.selectByValue("3");

//		se.selectByVisibleText("Feb");

		List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']/option"));

//		System.out.println("Size of lsit box : " + monthList.size());
//
//		for (int i = 0; i < monthList.size(); i++) {
//
//			String monthName = monthList.get(i).getText();
//
//			System.out.println(monthName);
//
//		}

		for (int i = 1; i <= monthList.size(); i++) {

			String monthName = driver.findElement(By.xpath("//select[@id='month']/option["+i+"]")).getText();

			System.out.println(monthName);
			

		}
	
		
		
		// print month list

		// select month

		// verify month name is available or not in the list

	}

}

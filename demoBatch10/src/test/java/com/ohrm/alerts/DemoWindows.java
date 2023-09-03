package com.ohrm.alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWindows {
	// how to handle multiple windows?

	@Test
	public void testAlerts() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");

		driver.manage().window().maximize();

		WebElement search_ele = driver
				.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']"));

		search_ele.sendKeys("selenium java");

		WebElement searchBtn_ele = driver.findElement(By.className("qsbSubmit"));
		searchBtn_ele.click();

		String parent_window_id = driver.getWindowHandle();

		System.out.println(parent_window_id);

		// get the page title
//		String exp_pagetitle = "Selenium Java Jobs, 8234 Selenium Java Job Vacancies In September 2023 - Naukri.com";
//		String title1 = driver.getTitle();

//		System.out.println("first page title :" + title1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='list']/article[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='list']/article[2]")).click();
		Thread.sleep(3000);
		// what is the return type of windowhandles - set of strings

		// what is the return type of windowhandle - String type

		Set<String> allWindows = driver.getWindowHandles();

		int numbeOfWindows = allWindows.size();
		System.out.println(numbeOfWindows);

		for (String window : allWindows) {
			
			System.out.println("window id from iteration : "+ window);
			if (!parent_window_id.equals(window)) {
				driver.switchTo().window(window);

				driver.findElement(By.id("login-apply-button")).click();

				Thread.sleep(3000);

//				driver.close();
				driver.quit();
			} else {
				System.out.println("this is the patent window");
			}

		}

	}

}

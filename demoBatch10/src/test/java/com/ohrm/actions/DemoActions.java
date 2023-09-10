package com.ohrm.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoActions {
	@Test
	public void test() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {
			// Navigate to Url
			driver.get("https://google.com");

			// Enter "webdriver" text and perform "ENTER" keyboard action
//			driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);

			Actions actionProvider = new Actions(driver);
	
//			Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
//			keydown.perform();

			// Enters text "qwerty" with keyDown SHIFT key and after keyUp SHIFT key
			// (QWERTYqwerty)

//			WebElement search = driver.findElement(By.name("q"));
//			actionProvider.keyDown(Keys.SHIFT).sendKeys(search, "qwerty").keyUp(Keys.SHIFT)
//			.sendKeys( Keys.ENTER)
////			.sendKeys("qwerty")
//					.perform();
			WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
			// Perform click-and-hold action on the element
//		      actionProvider.clickAndHold(searchBtn).build().perform();

			// Perform context-click action on the element
//		      actionProvider.contextClick(searchBtn).build().perform();

			// Perform double-click action on the element
//		      actionProvider.doubleClick(searchBtn).build().perform();

			// Perform double-click action on the element
//		      actionProvider.click(searchBtn).build().perform();

			WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
			// Performs mouse move action onto the element
//			actionProvider.moveToElement(gmailLink).build().perform();
			
			
			actionProvider.moveToElement(gmailLink)
			.contextClick()
//			.sendKeys(Keys.DOWN, Keys.RETURN)
			.sendKeys(Keys.DOWN)
			.sendKeys(Keys.DOWN)
//			.click()
			.build().perform();
			
			
		} finally {
//			driver.quit();
			System.out.println(driver.getTitle());
		}
	}
}

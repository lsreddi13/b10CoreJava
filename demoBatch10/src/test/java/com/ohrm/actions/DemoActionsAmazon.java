package com.ohrm.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoActionsAmazon {

	@Test
	public void test() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {
			// Navigate to Url
			driver.get("https://www.google.com/intl/en-GB/gmail/about/");
			
			
			Actions actionProvider = new Actions(driver);
			WebElement gmailLink = driver.findElement(By.cssSelector("a> .laptop-desktop-only"));
			actionProvider.moveToElement(gmailLink)
//			.contextClick()
//			.sendKeys(Keys.DOWN, Keys.RETURN)
//			.sendKeys(Keys.DOWN)
//			.sendKeys(Keys.DOWN)
//			.click()
			.build().perform();
			
			driver.navigate().to("https://www.amazon.in/");
			WebElement we = driver.findElement(By.cssSelector("a > span.nav-line-2"));
			
			actionProvider.moveToElement(we)
			.build().perform();
			
			WebElement we2 = driver.findElement(By.xpath("//a/span[contains(text(), 'Your Account')]/.."));
			
			String url_yourAccount = we2.getAttribute("href");
			System.out.println("Your acount url : "+ url_yourAccount);
			
			we2.click();
			
			String act_url = driver.getCurrentUrl();
			Assert.assertEquals(url_yourAccount, act_url);
			
			
			
			
		} finally {
//			driver.quit();
			driver.navigate().to("https://www.amazon.in/");
		}
		
	}
}

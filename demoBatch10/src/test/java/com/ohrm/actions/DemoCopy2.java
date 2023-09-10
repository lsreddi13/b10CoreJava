package com.ohrm.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoCopy2 {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/");
		Thread.sleep(3000);
		Actions a = new Actions(driver);

		// Double click on element

		WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		a.doubleClick(trialaction).build().perform();
	}
}

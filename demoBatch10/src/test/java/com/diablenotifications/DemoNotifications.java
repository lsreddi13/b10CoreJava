package com.diablenotifications;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

//how to handle browser notifications.
public class DemoNotifications {

	@Test(enabled = true)
	public void testFirefoxNotifications() {
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", true);
//		WebDriver driver = new FirefoxDriver(options);
		FirefoxDriver driver = new FirefoxDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bennish.net/web-notifications.html");
		driver.findElement(By.xpath("//p/button[1]")).click();

	}

	@Test(enabled = true)
	public void testChromeNotifications() {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		WebDriver driver2 = new ChromeDriver(ops);
		driver2.get("https://www.bennish.net/web-notifications.html");
		driver2.findElement(By.xpath("//p/button[1]")).click();

	}
}

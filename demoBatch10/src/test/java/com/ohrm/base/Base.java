package com.ohrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	
	public void closeBrowser() {
		driver.quit();
	}

	public static void selectBrowser(String browsername) {
		// switch case:
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browsername.equals("edge")) {
			driver = new EdgeDriver();

		} else {
			driver = new EdgeDriver();
		}

	}

	public void selectBrowser2(String browsername) {
		// switch case:

	}
}

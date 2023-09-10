package com.takescreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTakeScreenshots {

	@Test
	public void testTakeScreenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		System.out.println("page launched.");
		
		
		//takescreenshot
//		.png, .jpg, .JPEG
			
		
		WebElement we = driver.findElement(By.id("txtUsername"));
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		
		takeScreenshot(we, "username");
		
		takeScreenshot(loginBtn, "loginButton");
		takeScreenshot(driver, "loginPage");
		
		
	}
	
	public static void takeScreenshot(WebElement we, String name) throws IOException {
		File scrFile = we.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File(".\\screenshots\\"+name+".png"));
	}
	
	public static void takeScreenshot(WebDriver driver, String filename) throws IOException {
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File(".\\screenshots\\"+filename+".png"));
	}
	
	
}

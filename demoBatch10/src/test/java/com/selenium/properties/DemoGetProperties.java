package com.selenium.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoGetProperties {

	@Test
	public void testProperties() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".//config.properties");
		prop.load(fis);
		String url = prop.getProperty("qa_url");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement uName = driver.findElement(By.id("txtUsername"));
		uName.sendKeys(prop.getProperty("s_name"));

		WebElement uPwd = driver.findElement(By.id("txtPassword"));
		uPwd.sendKeys(prop.getProperty("s_pwd"));

		driver.findElement(By.id("btnLogin")).click();

	}
}

package com.selenium.proprties;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DemoCreateNewUser extends demoPropertiesFile {
	static WebDriver driver;
//	String id_uname ="txtUsername";
	public static By username_ele = By.id("txtUsername");
	public static By pwd_ele = By.id("txtPassword");
	public static By loginBtn_ele = By.id("btnLogin");
	
	public DemoCreateNewUser() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() {
		// webdriver manger setup to use the browser driver.
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));// get the url from properties file
	}
	public void login(String uName, String password) throws InterruptedException {
		WebElement email = driver.findElement(username_ele);
		email.clear();
		email.sendKeys(uName);// get the username from proerpties fiel
		WebElement pwd = driver.findElement(pwd_ele);
		pwd.clear();
		pwd.sendKeys(password);// get the pwd from properties file.
		WebElement loginBtn = driver.findElement(loginBtn_ele);
		loginBtn.click();
		Thread.sleep(3000);
	}
	@Test
	public void testLogin() throws InterruptedException {
		login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void testLogin2() throws InterruptedException {
		login(prop.getProperty("n_username"), prop.getProperty("n_password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}

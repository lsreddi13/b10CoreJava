package com.selenium.dataprovider;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.base.Base;
import com.ohrm.tests.Ding;

public class DemoDataprovider extends Base {

	

	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@BeforeMethod
	public void openBrowser() {
		selectBrowser("chrome");
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "test", dataProviderClass = Ding.class)
	public void testLogin(String s1, String s2) throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(3000);
//		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(s1);
//		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(s2);
		Thread.sleep(3000);
	}
}

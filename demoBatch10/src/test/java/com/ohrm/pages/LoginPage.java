package com.ohrm.pages;

import org.openqa.selenium.By;

import com.ohrm.base.Base;

public class LoginPage extends Base{

	public void login(String uname, String pwd) {
		driver.findElement(By.name("username")).sendKeys(uname);

		driver.findElement(By.name("password")).sendKeys(pwd);

		driver.findElement(By.className("oxd-button")).click();
		
//		driver.findElement(By.linkText("Forgot your password?")).click();
		

	}

}

package com.ohrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ohrm.base.Base;

public class EditUSerPage extends Base {

	WebElement newpwd = driver.findElement(By.xpath(
			"//div[@class='oxd-form-row user-password-row']//label[contains(text(), 'Password')]//../following-sibling::div/input"));

	WebElement confirmnewpwd = driver.findElement(By.xpath(
			"//form/div[@class='oxd-form-row user-password-row']//label[contains(text(), 'Confirm Password')]/../following-sibling::div/input"));

	// change password
	public void changePassword(String new_pwd) {

		newpwd.sendKeys(new_pwd);

		confirmnewpwd.sendKeys(new_pwd);

	}

}

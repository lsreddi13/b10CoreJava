package com.ohrm.tests;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ohrm.base.Base;
import com.ohrm.pages.EditUSerPage;
import com.ohrm.pages.LoginPage;

public class DDd2 extends Base {

	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	public void testBrowser() throws InterruptedException {
		selectBrowser("chrome");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();

		
		
		
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "admin123");

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser/34");
		Thread.sleep(5000);
		WebElement cp = driver.findElement(By.className("oxd-checkbox-input-icon"));

		if (cp.isSelected()) {
			System.out.println("it is selected already");
		} else {
			cp.click();
			System.out.println("no i selected change password.");
		}
		String newPassword = "User123";
		//enter new password
		EditUSerPage esp = new EditUSerPage();
		esp.changePassword(newPassword);

		System.out.println("Print page title : " + pageTitle);
		//		closeBrowser();

	}

}

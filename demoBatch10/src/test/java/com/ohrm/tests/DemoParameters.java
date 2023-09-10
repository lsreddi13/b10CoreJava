package com.ohrm.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ohrm.base.Base;
import com.ohrm.pages.EditUSerPage;
import com.ohrm.pages.LoginPage;

public class DemoParameters extends Base {

	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	
	@Parameters({"userName", "userpwd" })
	@Test
	public void testBrowser(String un, String up) throws InterruptedException {
		selectBrowser("chrome");
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		Thread.sleep(3000);
		LoginPage lp = new LoginPage();
		lp.login(un, up);

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

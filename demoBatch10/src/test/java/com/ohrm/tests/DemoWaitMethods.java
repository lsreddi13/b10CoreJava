package com.ohrm.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ohrm.base.Base;
import com.ohrm.pages.EditUSerPage;

public class DemoWaitMethods extends Base {

	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	public void testBrowser() throws InterruptedException {
		selectBrowser("chrome");

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(null));
		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();

		WebElement uname = driver.findElement(By.name("username"));
		WebElement loginBtn_ele = driver.findElement(By.className("oxd-button"));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("oxd-button"))));

//		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-button")));


		
		
		
		Wait<WebDriver> wait2 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(2)).ignoring(ElementNotInteractableException.class);

		wait2.until(ExpectedConditions.presenceOfElementLocated(By.className("oxd-button")));

		uname.sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		loginBtn_ele.click();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser/34");
//		Thread.sleep(5000);

		WebElement cp = driver.findElement(By.className("oxd-checkbox-input-icon"));

		if (cp.isSelected()) {
			System.out.println("it is selected already");
		} else {
			cp.click();
			System.out.println("no i selected change password.");
		}
		String newPassword = "User123";
		// enter new password
		EditUSerPage esp = new EditUSerPage();
		esp.changePassword(newPassword);

		System.out.println("Print page title : " + pageTitle);
		// closeBrowser();

	}

}

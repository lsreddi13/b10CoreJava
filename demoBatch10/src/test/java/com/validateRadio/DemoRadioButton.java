package com.validateRadio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoRadioButton {
	public static WebDriver driver;

	@Test
	public void checkRadioButton() {
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
//		driver.findElement(By.linkText("Create New Account")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			WebElement btn_crateAccount = driver.findElement(By.linkText("Create New Account"));
			if (btn_crateAccount.isDisplayed()) {
				btn_crateAccount.click();

				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.xpath("//label[contains(text(), 'Female')]/following-sibling::input")));
				selectGender("Male");
				verifyRadio("Female");
				verifyRadio("Male");
				
			} else {
				System.out.println("btn_crateAccount is not displayed.");
			}

		} catch (Exception e) {
			System.out.println("error occurred at : " + e);
		} finally {
//			driver.navigate().to("https://www.facebook.com/");
		}

	}

	public void selectGender(String genderValue) {
		WebElement genderOption = driver
				.findElement(By.xpath("//label[contains(text(), '" + genderValue + "')]/following-sibling::input"));

		genderOption.click();
	}

	public void verifyRadio(String selectedGender) {
		WebElement ss = driver
				.findElement(By.xpath("//label[contains(text(), '"+selectedGender+"')]/following-sibling::input"));
		if (ss.isSelected()) {
			System.out.println(selectedGender + " - radio button is selected");
		} else {
			System.out.println(selectedGender + " - Radio button is not selected.");
		}
	}

}

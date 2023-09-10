package com.ohrm.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoDragAndDrop2 {
	WebDriver driver;

	@Test(enabled = false)
	public void test() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		create obj for actions 
		Actions action = new Actions(driver);

		// source webelement
		WebElement s = driver.findElement(By.xpath("//li[@name='A']"));
		//

		// find target
		WebElement t = driver.findElement(By.xpath("//li[@name='H']"));
//		implement drag and drop feature
		action.dragAndDrop(s, t).build().perform();

		driver.navigate().to("https://testkru.com/Interactions/DragAndDrop");
		Thread.sleep(3000);
		WebElement el1 = driver.findElement(By.id("box1"));

		WebElement el2 = driver.findElement(By.id("dropZone3"));
//		action.dragAndDrop(el1, el2).build().perform();
//		action.dragAndDrop(s, t);
		action.clickAndHold(el1).moveToElement(el2).build().perform();
		action.release().build().perform();

	}

	@Test(enabled = false)
	public void test2() {
		driver = new ChromeDriver();
		driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
		// Store 'box A' as source element
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		// Store 'box B' as source element
		WebElement targetEle = driver.findElement(By.id("droppable"));
		Actions ac = new Actions(driver);
		// Performs drag and drop action of sourceEle onto the targetEle
//		actionProvider.dragAndDrop(sourceEle, targetEle).build().perform();

		ac.clickAndHold(sourceEle).moveToElement(targetEle)
//		.release()
				.build().perform();
		// Performs release event
		ac.release().build().perform();
	}

	@Test
	public void test3() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));
		WebElement titleB = driver.findElement(By.xpath("//li[text()= 'B']"));

		Actions ac = new Actions(driver);

		Thread.sleep(3000);
//		ac.moveToElement(titleC).clickAndHold().perform(); 

		ac.dragAndDrop(titleC, titleB).build().perform();

	}
}

package com.seleniumt.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class Test1 {

	@Parameters({"name"})
	@Test(groups = { "functest", "smoke" })
	  public void testMethod1(String x1) {
		String url = "https://www.amazon.in/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> li = driver.findElements(By.tagName("a"));
		
	
				
				
		int numberOfLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("links count : "+ numberOfLinks);
		
		
		for (WebElement webElement : li) {
			
			String linkText = webElement.getText();
			System.out.println("link name : "+ linkText);
			String link_url = webElement.getAttribute("class");
			System.out.println("Link url : "+ link_url);
			
		}
			
	  }
	 
	  @Test(groups = {"functest", "smoke"} )
	  public void testMethod2() {
		  System.out.println("run testMethod2");
	  }
	 
	  @Test(groups = { "functest" })
	  public void testMethod3() {
		  System.out.println("run testMethod3");
	  }
	}

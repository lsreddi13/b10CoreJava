package com.tooltip;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
class TestClass1 implements Runnable {
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browser", "chrome");
		capsHashtable.put("browser_version", "99.0");
		capsHashtable.put("os", "Windows");
		capsHashtable.put("os_version", "11");
    	capsHashtable.put("build", "browserstack-build-1");
		capsHashtable.put("name", "Thread 1");
		DemoRemoteWebDriver r1 = new DemoRemoteWebDriver();
		r1.executeTest(capsHashtable);
    }
}
class TestClass2 implements Runnable {
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browser", "firefox");
		capsHashtable.put("browser_version", "latest");
		capsHashtable.put("os", "Windows");
		capsHashtable.put("os_version", "10");
		capsHashtable.put("build", "browserstack-build-1");
		capsHashtable.put("name", "Thread 2");
		DemoRemoteWebDriver r2 = new DemoRemoteWebDriver();
    	r2.executeTest(capsHashtable);
  	}
}
class TestClass3 implements Runnable {
	public void run() {
		Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
		capsHashtable.put("browser", "safari");
		capsHashtable.put("browser_version", "latest");
		capsHashtable.put("os", "OS X");
		capsHashtable.put("os_version", "Big Sur");
		capsHashtable.put("build", "browserstack-build-1");
		capsHashtable.put("name", "Thread 3");
		DemoRemoteWebDriver r3 = new DemoRemoteWebDriver();
    	r3.executeTest(capsHashtable);
  	}
}
public class DemoRemoteWebDriver {
	public static final String USERNAME = "qatech2";
	public static final String AUTOMATE_KEY = "DbiqcZyzu4jxp6CaybN9";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static void main(String[] args) throws Exception {
		Thread object1 = new Thread(new TestClass1());
		object1.start();
		Thread object2 = new Thread(new TestClass2());
		object2.start();
		Thread object3 = new Thread(new TestClass3());
		object3.start();
  	}
	public void executeTest(Hashtable<String, String> capsHashtable) {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();
		// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
       		key = itr.next();
       		caps.setCapability(key, capsHashtable.get(key));
    	}
    	WebDriver driver;
		try {
			driver = new RemoteWebDriver(new URL(URL), caps);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			// Searching for 'BrowserStack' on google.com
			driver.get("https://www.google.com");
			WebElement element = driver.findElement(By.name("q"));
			element.sendKeys("BrowserStack");
			element.submit();
			// Setting the status of test as 'passed' or 'failed' based on the condition; if title of the web page contains 'BrowserStack'
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    	try {
				wait.until(ExpectedConditions.titleContains("BrowserStack"));
				jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
	    	}
	    	catch(Exception e) {
	    		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
	    	}
	    	System.out.println(driver.getTitle());
	    	driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
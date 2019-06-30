package com.TestNGCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 
{
	public class DataProviderTest {
		 
		 private WebDriver driver;
		 
		  @DataProvider(name = "Authentication")
		 
		  public Object[][] credentials() {
		 
		        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
		 
		  }
		 
		  // Here we are calling the Data Provider object with its Name
		 
		  @Test(dataProvider = "Authentication")
		 
		  public void test(String sUsername, String sPassword) {
		 
			  System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
				
			  driver = new ChromeDriver();
		 
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		      driver.get("http://www.store.demoqa.com");
		 
		      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		 
		      driver.findElement(By.id("log")).sendKeys(sUsername);
		 
		      driver.findElement(By.id("pwd")).sendKeys(sPassword);
		 
		      driver.findElement(By.id("login")).click();
		 
		      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		 
		      driver.quit();
		 
		  }
	}
}

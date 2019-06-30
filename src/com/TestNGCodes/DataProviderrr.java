package com.TestNGCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderrr
{

	@DataProvider(name = "data")
	public Object[][] abcd()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0]="afroj";
		data[0][1]="123";
		
		data[1][0]="asif";
		data[1][1]="123";
		
				
				
		
		return data;
		
	}
	
	@Test(dataProvider = "data")
	public void zas(String username,String pwrd) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
			
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		  
		  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pwrd);
		  
		  Thread.sleep(5000);
		  
		  
		
	}
		
		
	
	
	

	
}

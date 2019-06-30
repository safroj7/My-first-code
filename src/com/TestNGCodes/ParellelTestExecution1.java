package com.TestNGCodes;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelTestExecution1 
{
	@Test
	public void axs()
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
			
		  WebDriver driver = new ChromeDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("https://howtodoinjava.com/testng/testng-difference-between-factory-and-dataprovider/");
		
	}

}

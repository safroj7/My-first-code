package com.TestNGCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoOfWebelements 
{
@Test
public void abc()
{
	  System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
	
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");	
	  
	  List<WebElement> l1 = driver.findElements(By.tagName("*"));
	  
	  System.out.println(l1.size());
	  
}
}

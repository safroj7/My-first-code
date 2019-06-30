package com.TestNGCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.*;



public class PriorityAssign 
{
	WebDriver driver;
	
@Test(priority=1)
public void one()
{
	System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("safroj7");
	System.out.println("priority zero");
	
}

@Test(priority=2)
public void two()
{
System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
System.out.println("priority one");
}
}

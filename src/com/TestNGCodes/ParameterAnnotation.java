package com.TestNGCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation 
{
   //  @Parameters({"name","pass","name1","pass1"})
	@Test
	public void para(String user,String password,String user1,String password1)
	{
    	System.setProperty("webdriver.chrome.driver","E:\\Driver and jars\\chrome\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.id("email")).sendKeys(user);
    	driver.findElement(By.id("pass")).sendKeys(password);
    	driver.findElement(By.id("u_0_2")).click();
    	/*driver.findElement(By.id("email")).sendKeys(user1);
    	driver.findElement(By.id("pass")).sendKeys(password1);
    	driver.findElement(By.id("u_0_2")).click();*/
    	
		//System.out.println("First Output:" +output);
		
		
	}
	
	
	
}

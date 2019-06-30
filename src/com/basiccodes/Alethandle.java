package com.basiccodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alethandle {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("54680");
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).submit();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		
		driver.close();	
	}

}

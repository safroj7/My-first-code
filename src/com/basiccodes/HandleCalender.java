package com.basiccodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/");
		WebElement el=driver.findElement(By.xpath("//input[@type='datetime-local']"));
		el.sendKeys("03091991");
		Thread.sleep(3000);
		el.sendKeys(Keys.TAB);
		
		el.sendKeys("0200PM");
		Thread.sleep(5000);
		driver.close();
	}

}

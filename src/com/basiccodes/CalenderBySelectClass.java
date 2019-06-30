package com.basiccodes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CalenderBySelectClass
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		s1.selectByVisibleText("15");
		
		Select s2 = new Select(driver.findElement(By.xpath("//select[@aria-label='Year']")));
		s2.selectByVisibleText("1991");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}

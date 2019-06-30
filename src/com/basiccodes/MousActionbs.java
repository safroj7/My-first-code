package com.basiccodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousActionbs {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\\\Driver and jars\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement ele = driver.findElement(By.xpath("(//a[@href='index.php'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(ele);
	act.click().build().perform();
	
	
	//Right click on same element
	
	act.contextClick(ele);
	act.click().build().perform();
	Thread.sleep(5000);
	
	
	
	driver.quit();
	}

}

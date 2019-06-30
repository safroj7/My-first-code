package com.basiccodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelect {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		
	    driver.get("http://www.makemytrip.com/");
	  WebElement e =  driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]"));
	    System.out.println(e.isSelected());
	    System.out.println(e.getText());
	    System.out.println(e.isDisplayed());
	    System.out.println(e.isEnabled());

	    }
	}



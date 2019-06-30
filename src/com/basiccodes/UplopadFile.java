package com.basiccodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplopadFile {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver and jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='uploadfile_0']")).sendKeys("E:\\Demo excell file");
		WebElement ele = driver.findElement(By.xpath("//input[@name='terms']"));
		ele.isSelected();
		ele.click();
		
		driver.findElement(By.xpath("//button[@name='send']")).click();
		
		Thread.sleep(5000);
		
		driver.close();	

	}

}

package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//path of chrome browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chinna.Putha\\Downloads\\SeleniumJarsInfo\\chromedriver.exe");
		
		//open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//hit application url on browser
		driver.get("https://www.google.com/");
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//enter text in google search box
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java selenium");
		
		Thread.sleep(4000);
		
		//close browser
		driver.close();
		
	}

}

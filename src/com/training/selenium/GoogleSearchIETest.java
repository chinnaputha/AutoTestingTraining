package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;


/**
 * Class to execute automation script in Internet Explorer(IE) browser
 * @author Chinna.Putha
 *
 */
public class GoogleSearchIETest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//path of IE browser driver
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		
		//open the IE browser
		InternetExplorerDriver driver = new InternetExplorerDriver();
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

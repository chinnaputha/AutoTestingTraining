package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Class to execute automation script in Firefox(FF) browser
 * @author Chinna.Putha
 *
 */
public class GoogleSearchFFTest {
	
	static String app_URL="https://www.google.com/";
	
	public static void main(String[] args) throws InterruptedException {
		
		//path of FF browser driver
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		//open the FF browser
		WebDriver driver = new FirefoxDriver();
		
		//ChromeDriver driver = new ChromeDriver();
		//hit application url on browser
		driver.get(app_URL);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//enter text in google search box
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java selenium");
		
		
		String title=driver.getTitle();
		System.out.println("Page Title-->"+title);
		
		String cur_url=driver.getCurrentUrl();
		System.out.println("Page current url-->"+cur_url);
		
		if(cur_url.equals("https://www.google.com/")) {
			System.out.println("current url have google.com");
		} else {
			System.out.println("user navigate different page");
		}
		
		String srcPage=driver.getPageSource();
		System.out.println("Page source code-->"+srcPage);
		
		
		Thread.sleep(4000);
		
		//close browser
		driver.close();
		
	}

}

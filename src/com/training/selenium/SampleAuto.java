package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAuto {
	
	static String app_URL="file:///C:/Users/Chinna.Putha/eclipse-workspace/AutoTestingTraining/src/com/training/selenium/sample.html";
	
	public static void main(String[] args) throws InterruptedException {
		
		//path of chrome browser driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		//open the chrome browser
		WebDriver driver = new ChromeDriver();
		
		
		//ChromeDriver driver = new ChromeDriver();
		//hit application url on browser
		driver.get(app_URL);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//enter text in username field
//		WebElement ele = driver.findElement(By.id("uid"));
//		ele.sendKeys("Tester");
		driver.findElement(By.id("uid")).sendKeys("Tester");
		driver.findElement(By.id("upwd")).sendKeys("sadfsdfsdfs");
		Thread.sleep(4000);
		driver.findElement(By.id("upwd")).clear();
		
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

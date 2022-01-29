package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoRegisterForm  extends TestBase {
	
	public void registerForm() throws InterruptedException {
		openApplication("chrome", "http://demo.automationtesting.in/Register.html");
		//WebElement ele = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//ele.sendKeys("MyFirstName");
		
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("MYFIRSTNAME");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("MYLASTNAME");
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("HNO-111,KDP,AP,INDIA,560037");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).clear();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		AutoRegisterForm arf = new AutoRegisterForm();
		arf.registerForm();

	}

}

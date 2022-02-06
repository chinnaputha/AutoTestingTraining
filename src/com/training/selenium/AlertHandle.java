package com.training.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandle extends TestBase {
	String str="Selenium";

	public void handleAlert() throws InterruptedException {
		openApplication("chrome", "http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
		//switch to alert
		Alert  al = driver.switchTo().alert();
		String alertText = al.getText();
		System.out.println("alert Text-->"+alertText);
		Thread.sleep(2000);
		//al.dismiss(); //click on Cancel on Alert window/popup
		al.sendKeys(str);//enter value in alert input box
		Thread.sleep(2000);
		al.accept();//click on Ok button
		
		String alEnteredText = driver.findElement(By.cssSelector("p#demo1")).getText();
		System.out.println("text--->"+alEnteredText);
		
		if(alEnteredText.contains(str)) {
			System.out.println("Entered text available");
		} else {
			System.out.println("Entered text unavailable");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		AlertHandle wh = new AlertHandle();
		wh.handleAlert();

	}

}

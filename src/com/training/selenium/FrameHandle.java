package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameHandle extends TestBase {

	public void handleFrame() throws InterruptedException {
		openApplication("chrome", "http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();


		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		Thread.sleep(2000);
		
		//switch to frame
		//driver.switchTo().frame(0);//switching frame using index position
		//driver.switchTo().frame("SingleFrame");//switching to frame using name or id
		
		WebElement frameWE=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frameWE);//switching to frame using web element
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		
		//switch out from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Home']")).click();

	}

	public static void main(String[] args) throws InterruptedException {
		FrameHandle wh = new FrameHandle();
		wh.handleFrame();

	}

}

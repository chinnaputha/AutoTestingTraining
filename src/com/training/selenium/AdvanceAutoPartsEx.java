package com.training.selenium;

import org.openqa.selenium.By;

public class AdvanceAutoPartsEx extends TestBase {

	public void advanceAuto() throws InterruptedException {
		openApplication("chrome", "https://shop.advanceautoparts.com/");
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("cars");
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		AdvanceAutoPartsEx aex = new AdvanceAutoPartsEx();
		aex.advanceAuto();
	}
}

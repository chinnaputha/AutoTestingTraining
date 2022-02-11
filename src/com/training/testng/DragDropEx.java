package com.training.testng;


import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class DragDropEx extends TestBase {

	@Test(alwaysRun = true)
	public void actionExample() throws InterruptedException {
		openApplication("Chrome", "https://demoqa.com/droppable/");
		
		WebElement srcEle = driver.findElement(By.cssSelector("div#draggable"));
		WebElement destEle = driver.findElement(By.cssSelector("div#droppable"));
		
		Actions act =  new Actions(driver);
		act.dragAndDrop(srcEle, destEle).build().perform();
		
		Thread.sleep(3000);
		WebElement accpt = driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
	
		boolean isButtonEnable = accpt.isEnabled();
		System.out.println("button status-->"+isButtonEnable);
		
		Assert.assertTrue(isButtonEnable,"Accept button should be enabled");
	
		//Assert.assertFalse(isButtonEnable, "");
		//Assert.assertEquals(isButtonEnable, true,"Accept button should be enabled");
		
		//right click on given web element
		act.contextClick(accpt).build().perform();
		
		
		
		Thread.sleep(6000);
		
	}

	@AfterTest
	public void closeBr() {
		driver.quit();
	}

}

package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;
/**
 * Class to perfor javascript executor operations like click, scroll down/up...etc
 * @author Chinna.Putha
 *
 */
public class JSETest extends TestBase {
	
	@Test
	public void jsOperations() throws InterruptedException {
		openApplication("chrome", "https://www.naukri.com/");
		
		//driver.findElement(By.xpath("//a[contains(text(),'center')]")).click();
		
		
		//refresh the page using jsexeutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0);");
		
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'center')]"));
		
		//scroll to webElement
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		Thread.sleep(4000);
		
		//js click
		js.executeScript("arguments[0].click();", ele);
		Thread.sleep(6000);
	}
	
	
	@AfterClass
	public void closeBr(){
		closeBrowser();
	}

}

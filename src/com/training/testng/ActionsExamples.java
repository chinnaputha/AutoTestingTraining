package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class ActionsExamples extends TestBase {

	@Test(alwaysRun = true)
	@Parameters({"appURL"})
	public void actionExample(String appURL) throws InterruptedException {
		openApplication("Chrome", appURL);
		
		WebElement ele = driver.findElement(By.cssSelector("a[href='Interactions.html']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()[normalize-space()='Drag and Drop']]")));
		
		WebElement ele2 = driver.findElement(By.xpath("//a[text()[normalize-space()='Drag and Drop']]"));
		
		act.moveToElement(ele2).build().perform();
		
		//explict wait for Static link
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()[normalize-space()='Static']]")));
		
		//click using Actions class click method
		WebElement ele3 = driver.findElement(By.xpath("//a[text()[normalize-space()='Static']]"));
		//ele3.click();
		act.click(ele3).build().perform();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#angular")));
		
		//refresh page
		//driver.navigate().refresh();
		
		WebElement srcEle = driver.findElement(By.cssSelector("img#angular"));
		WebElement destEle = driver.findElement(By.cssSelector("div#droparea"));
		
		act.dragAndDrop(srcEle, destEle).build().perform();
		
		Thread.sleep(6000);
		
	}

	@AfterTest
	public void closeBr() {
		driver.quit();
	}

}

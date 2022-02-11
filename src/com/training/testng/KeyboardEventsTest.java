package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class KeyboardEventsTest extends TestBase {

	@Test(alwaysRun = true)
	@Parameters({ "appURL" })
	public void actionExample(String appURL) throws InterruptedException {
		openApplication("Chrome", appURL);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("MyFirstname");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("MyLastname");

		WebElement ele = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));

		Actions act = new Actions(driver);
		act.keyDown(ele, Keys.SHIFT).sendKeys(ele, "hi testing my addresss").keyUp(ele, Keys.SHIFT).build().perform();

		Thread.sleep(3000);

//		ele.sendKeys(Keys.CONTROL,"a");
//		Thread.sleep(3000);
//		ele.sendKeys(Keys.DELETE);

		// combine multiple keyboard events
		String multiKeys = Keys.chord(Keys.CONTROL, "a", Keys.DELETE);
		ele.sendKeys(multiKeys);

		// ele.sendKeys(Keys.CONTROL,Keys.TAB);
		act.keyDown(ele, Keys.CONTROL).sendKeys(ele, "t").keyUp(ele, Keys.CONTROL).build().perform();

		Thread.sleep(6000);

	}

	@AfterTest
	public void closeBr() {
		driver.quit();
	}

}

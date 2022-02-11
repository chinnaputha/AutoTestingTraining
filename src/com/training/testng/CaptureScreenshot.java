package com.training.testng;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class CaptureScreenshot extends TestBase {
	
	@Test(alwaysRun = true)
	public void capScreenshot() throws InterruptedException, IOException {
		openApplication("Chrome", "http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(RandomStringUtils.randomAlphanumeric(5));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(RandomStringUtils.randomAlphanumeric(10));
	
		
		String randomValues= RandomStringUtils.randomAlphanumeric(6);
		System.out.println("random values-->"+randomValues);
		getScreenshot();
		
		Thread.sleep(6000);
	
	}
	
	@AfterClass
	public void browserClose() {
		driver.close();
	}

}

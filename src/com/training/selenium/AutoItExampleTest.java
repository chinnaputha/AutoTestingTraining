package com.training.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutoItExampleTest extends TestBase {

	@Test
	public void fileUpload() throws InterruptedException, IOException {
		openApplication("chrome", "http://demo.automationtesting.in/FileUpload.html");
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='btn btn-primary btn-file']")));


		
		driver.findElement(By.cssSelector("div[class='btn btn-primary btn-file']")).click();
		Thread.sleep(4000);
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path-->"+projectPath);
		String filePath= projectPath+"\\autoit\\fileUpload.exe";
		System.out.println("file path-->"+filePath);
		// introducing autoit code
		Runtime.getRuntime().exec(filePath);
		
		
		//
	}

}

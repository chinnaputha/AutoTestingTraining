package com.training.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class NaukriExampleTest extends TestBase {

	@Test
	@Parameters({"browser","username","password"})
	public void naukriLogin(String browser,String username,String password) throws InterruptedException, IOException {
		openApplication(browser, "https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		//Thread.sleep(30000);
		System.out.println("username-->"+username+"-->"+password);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(password);
		driver.findElement(By.cssSelector("button[class*='loginButton']")).click();
		//Thread.sleep(4000);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='popout profile-section card']")));
		
		
		String pageTitle = driver.getTitle();
		System.out.println("PageTitle-->"+pageTitle);
		Assert.assertEquals(pageTitle, "Home | Mynaukri","Page title is mismatching...");
		System.out.println("11111111");
		getScreenshot("Naukri");
		
	}

	@Test(dependsOnMethods = "naukriLogin")
	public void profileUpdate() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='updateProfile']/div[2]/div"))));
		
		driver.findElement(By.xpath("//div[@class='updateProfile']/div[2]/div")).click();
		
		System.out.println("profile updaated");
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//div[@class='dashboard blue-bg card']"))));
	
	}

	@Test(dependsOnMethods = "profileUpdate")
	public void logout() {
		System.out.println("logout success");
	}
	
	@AfterTest
	public void closeBr() {
		driver.quit();
	}

}

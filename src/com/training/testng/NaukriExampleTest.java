package com.training.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class NaukriExampleTest extends TestBase {

	@Test
	@Parameters({"username","password"})
	public void naukriLogin(String username,String password) throws InterruptedException {
		openApplication("Chrome", "https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		Thread.sleep(4000);
		System.out.println("username-->"+username+"-->"+password);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(password);
		driver.findElement(By.cssSelector("button[class*='loginButton']")).click();
		Thread.sleep(4000);
		String pageTitle = driver.getTitle();
		System.out.println("PageTitle-->"+pageTitle);
		Assert.assertEquals(pageTitle, "Home | Mynaukri","Page title is mismatching...");
		System.out.println("11111111");
		
	}

	@Test(dependsOnMethods = "naukriLogin")
	public void profileUpdate() {
		System.out.println("profile updaated");
	}

	@Test(dependsOnMethods = "profileUpdate")
	public void logout() {
		System.out.println("logout success");
	}
	
	@AfterClass
	public void closeBr() {
		driver.close();
	}

}

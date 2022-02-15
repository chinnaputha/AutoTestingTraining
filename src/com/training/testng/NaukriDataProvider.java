package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class NaukriDataProvider extends TestBase {

	
	@Test(dataProvider = "loginData")
	public void naukriLoginTest(String username,String password) {
		try {
		openApplication("chrome", "https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		// Thread.sleep(30000);
		System.out.println("username-->" + username + "-->" + password);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
				.sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(password);
		driver.findElement(By.cssSelector("button[class*='loginButton']")).click();
		// Thread.sleep(4000);

		// Explicit wait
		
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='popout profile-section card']")));

			String pageTitle = driver.getTitle();
			System.out.println("PageTitle-->" + pageTitle);
			Assert.assertEquals(pageTitle, "Home | Mynaukri", "Page title is mismatching...");
		} catch (Exception e) {
			System.out.println("in catch block");
			e.printStackTrace();
		}finally {
			driver.close();
		}

	}
	
	@DataProvider(name="loginData")
	public Object[][] testData(){
		
		Object[][] data = new Object[2][2]; //3 rows and 2 columns
		//1st row
		data[0][0]="javacampus.selenium@gmail.com";
		data[0][1]="Testing@123";
		
		//2nd row
		data[1][0]="hellotest@gmail.com";
		data[1][1]="Naukri@789";
		
		//3rd row
		//data[2][0]="1111111111789@gmail.com";
		//data[2][1]="ryyuoiaasdfsdf";
		
		return data;
		
	}
	
	@AfterClass
	public void killBrowser() {
		driver.close();
	}

}

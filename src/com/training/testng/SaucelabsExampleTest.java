package com.training.testng;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class SaucelabsExampleTest extends TestBase{
	
	WebDriverWait wait;
	
	/**
	 * Open Application in Saucelabs
	 */
	@Test
	public void openAppinSaucelabs()throws Exception{
		runOnSauceLabsFromLocal("Windows", "Chrome");
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		//Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("javacampus.selenium@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Testing@123");
		driver.findElement(By.cssSelector("button[class*='loginButton']")).click();
		//Thread.sleep(4000);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='popout profile-section card']")));
		
		
		String pageTitle = driver.getTitle();
		System.out.println("PageTitle-->"+pageTitle);
		Assert.assertEquals(pageTitle, "Home | Mynaukri","Page title is mismatching...");
		System.out.println("11111111");
		getScreenshot("NaukriSauce");
	}
	
	
	@AfterClass
	public void closeBr() {
		driver.close();
	}
	
	
	public void runOnSauceLabsFromLocal(String os, String browser) throws Exception {

		String username = "oauth-chinnareddy.info-dd035";
		String access_key = "00b4c724-22db-4404-bddd-75c4b18793c8";
	    String url = "https://" + username + ":" + access_key + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

		//String url ="https://oauth-chinnareddy.info-dd035:00b4c724-22db-4404-bddd-75c4b18793c8@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
		DesiredCapabilities caps = null;

		if (os.equalsIgnoreCase("Windows")) {
 
			if (browser.equalsIgnoreCase("Chrome")) {
				caps = DesiredCapabilities.chrome();
				caps.setCapability("platform", "Windows 10"); 
				caps.setCapability("version", "98.0");
				caps.setCapability("name", "MyTestingEx");
				
			}

			if (browser.equalsIgnoreCase("FF")) {
				caps = DesiredCapabilities.firefox();
				caps.setCapability("platform", "Windows 10");
				caps.setCapability("version", "90.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

			if (browser.equalsIgnoreCase("IE")) {
				caps = DesiredCapabilities.internetExplorer();
				caps.setCapability("platform", "Windows 8.1");
				caps.setCapability("version", "11.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

		}

		if (os.equalsIgnoreCase("Mac")) {

			if (browser.equalsIgnoreCase("Chrome")) {

				caps = DesiredCapabilities.chrome();
				caps.setCapability("platform", "OS X 10.11");
				caps.setCapability("version", "48.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

			if (browser.equalsIgnoreCase("FF")) {

				caps = DesiredCapabilities.firefox();
				caps.setCapability("platform", "OS X 10.11");
				caps.setCapability("version", "44.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

			if (browser.equalsIgnoreCase("Safari")) {

				caps = DesiredCapabilities.safari();
				caps.setCapability("platform", "OS X 10.11");
				caps.setCapability("version", "9.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}
		}

		if (os.equalsIgnoreCase("iOS")) {

			caps = DesiredCapabilities.iphone();
			caps.setCapability("platform", "OS X 10.10");
			caps.setCapability("version", "9.2");
			caps.setCapability("deviceName", "iPhone 6");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("name", this.getClass().getSimpleName());
		}

		if (os.equalsIgnoreCase("Android")) {

			caps = DesiredCapabilities.android();
			caps.setCapability("platform", "Linux");
			caps.setCapability("version", "5.1");
			caps.setCapability("deviceName", "Android Emulator");
			caps.setCapability("deviceType", "phone");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("name", this.getClass().getSimpleName());
		}

		driver = new RemoteWebDriver(new URL(url), caps);

	}

	
	

}

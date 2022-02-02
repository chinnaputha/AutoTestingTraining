package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public WebDriver driver;

	public void openApplication(String browser, String appURL) {

		if (browser.equalsIgnoreCase("chrome")) {
			// path of chrome browser driver
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			// open the chrome browser
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox") || browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			//open the FF browser
			 driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
			//open the IE browser
			 driver = new InternetExplorerDriver();
		}

		// hit application url on browser
		driver.get(appURL);
		// maximize browser window
		driver.manage().window().maximize();

	}
	
	public void closeBrowser() {
		driver.close();
	}
	
}

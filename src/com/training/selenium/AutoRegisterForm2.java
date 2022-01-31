package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoRegisterForm2 extends TestBase {

	public void registerForm() throws InterruptedException {
		openApplication("chrome", "http://demo.automationtesting.in/Register.html");
		// WebElement ele = driver.findElement(By.cssSelector("input[placeholder='First
		// Name']"));
		// ele.sendKeys("MyFirstName");

		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("MYFIRSTNAME");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("MYLASTNAME");
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("HNO-111,KDP,AP,INDIA,560037");

		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("1234567890");

		boolean isRadioButtonSelected = driver.findElement(By.cssSelector("input[value='FeMale']")).isSelected();
		System.out.println("Radio button selected-->" + isRadioButtonSelected);
		if (!isRadioButtonSelected) {
			System.out.println("inside if");
			driver.findElement(By.cssSelector("input[value='FeMale']")).click();
		}

		WebElement chxBx = driver.findElement(By.cssSelector("input[value='Cricket']"));
		if (chxBx.isEnabled()) {
			System.out.println("Check box enabled");
			chxBx.click();
			System.out.println("Check box clicked and its selected-->" + chxBx.isSelected());
		}
		Thread.sleep(3000);
		// how to find how many check boxes in a web page
		List<WebElement> mulChkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("total checkboxes in a webpage-->" + mulChkBoxes.size());// 3

//		int count = 1;
//		for (WebElement checkBox : mulChkBoxes) {
//			System.out.println("count times  " + count);
//			if (!checkBox.isSelected()) {
//				checkBox.click();
//			}
//			++count;
//		}

//		for (int i = 0; i < mulChkBoxes.size(); i++) {
//			if (!mulChkBoxes.get(i).isSelected()) {
//				mulChkBoxes.get(i).click();
//			}
//		}

		// check only cricket and Hockey check boxes
		for (int i = 0; i < mulChkBoxes.size(); i++) {
			String attrValue = mulChkBoxes.get(i).getAttribute("value");
			System.out.println("attribute value-->" + attrValue);
			if (attrValue.equals("Cricket") || attrValue.equals("Hockey")) {
				if (!mulChkBoxes.get(i).isSelected()) {
					mulChkBoxes.get(i).click();
				}
			}
		}
		
		
		//how to find how many links in a webpage
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("total links in a web page -->"+totalLinks.size());
		
		String linkAddress = totalLinks.get(0).getAttribute("href");
		System.out.println("link address-->"+linkAddress);
		
		for(WebElement link:totalLinks) {
			System.out.println("links address-->"+link.getAttribute("href"));
		}
		
		
		//get links using parent to child relationship
		List<WebElement> footerLinks = driver.findElements(By.cssSelector("footer[id='footer'] a"));
		System.out.println("total footer links in a web page -->"+footerLinks.size());
		for(WebElement fLink:footerLinks) {
			System.out.println("links address-->"+fLink.getAttribute("href"));
			fLink.click();
		}
		
		
		
		Thread.sleep(6000);

		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		AutoRegisterForm2 arf = new AutoRegisterForm2();
		arf.registerForm();

	}

}

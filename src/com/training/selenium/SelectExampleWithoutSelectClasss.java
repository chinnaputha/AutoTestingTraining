package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectExampleWithoutSelectClasss  extends TestBase {
	
	WebElement selectValue;
	
	public void selectExWithoutSelect() throws Exception {
		openApplication("chrome", "http://demo.automationtesting.in/Register.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[@role='combobox']"));
		ele.click();
		Thread.sleep(3000);
		List<WebElement> totDDOptions = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));
		System.out.println("total options-->"+totDDOptions.size());
		Thread.sleep(3000);
		
		for(WebElement option:totDDOptions) {
			System.out.println("option value-->"+option.getText());
			if(option.getText().equals("Denmark")) {
				System.out.println("Desired option value is availale in Skill dropdown");
				option.click();
				break;
			}
		}
		
		
		Thread.sleep(6000);//1000 ms -- 1 sec
		
		//closeBrowser();
		
		
	}

	public static void main(String[] args) throws Exception {
		SelectExampleWithoutSelectClasss arf = new SelectExampleWithoutSelectClasss();
		arf.selectExWithoutSelect();

	}

}

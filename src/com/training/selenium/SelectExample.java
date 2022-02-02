package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectExample  extends TestBase {
	
	WebElement selectValue;
	
	public void selectEx() throws Exception {
		openApplication("chrome", "http://demo.automationtesting.in/Register.html");
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select ses = new Select(ele);
		//ses.selectByIndex(18);//select dropdown value using index position
		//ses.selectByValue("Email");//select dropdown value using option value attribute
		ses.selectByVisibleText("Open Source Software");//select dropdown using visible text
		
		selectValue= ses.getFirstSelectedOption();//get the selected value
		System.out.println("Text in webelement-->"+selectValue.getText());
		
//		if(selectValue.getText().equals("Microsoft Excel")) {
//			System.out.println("Validation is correct");
//		} else {
//			System.out.println("validation is incorrect");
//		}
//		
		if(!selectValue.getText().equals("Microsoft Excel2")) {
			System.out.println("Validation is incorrect");
			
		} 
		
		//get all available options from Dropdown
		List<WebElement> allAvailOption= ses.getOptions();
		System.out.println("options count-->"+allAvailOption.size());//78
		
		
		//to find desired element in dropdown
		//for each loop
		for(WebElement option:allAvailOption) {
			System.out.println("option value-->"+option.getText());
			if(option.getText().equals("Oracle")) {
				System.out.println("Desired option value is availale in Skill dropdown");
				break;
			}
		}
		
		//select element using partial text of dropdown value
		for(WebElement option:allAvailOption) {
			System.out.println("option value-->"+option.getText());
			if(option.getText().contains("Photoshop")) {
				option.click();
				break;
			}
		}
		
		selectValue= ses.getFirstSelectedOption();//get the selected value
		System.out.println("Text in webelement-->"+selectValue.getText());
		
		Thread.sleep(6000);//1000 ms -- 1 sec
		
		closeBrowser();
		
		
	}

	public static void main(String[] args) throws Exception {
		SelectExample arf = new SelectExample();
		arf.selectEx();

	}

}

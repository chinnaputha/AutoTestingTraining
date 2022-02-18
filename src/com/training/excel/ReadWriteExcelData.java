package com.training.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class ReadWriteExcelData extends TestBase {
	
	String username="";
	String password="";
	
	@Test(alwaysRun = true)
	public void getCredentials() throws IOException {
		
		File file = new File("excelfiles\\Naukri_Credentials.xlsx");
		//read file data
		FileInputStream fis = new FileInputStream(file);
		//Convert file into the excel workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//go to the particular sheet using name or index
		XSSFSheet sheet = wb.getSheet("LoginCred");
		int totalRows= sheet.getPhysicalNumberOfRows();
		System.out.println("total available rows in sheet-->"+totalRows);
		//goto the row
		XSSFRow row = sheet.getRow(2);
		//goto cell for particular row
		XSSFCell cell1 = row.getCell(0);
		XSSFCell cell2 = row.getCell(1);
		
		username= cell1.toString();
		password= cell2.toString();
		System.out.println("USERNAME-->"+username);
		System.out.println("PASSWORD-->"+password);
			
		//close file read mode
		fis.close();
		
		row.createCell(3).setCellValue("yes TC passed");
		row.createCell(7).setCellValue("yes TC updated");
		row.createCell(8).setCellValue("addded new cell with value");
		//write file data
		FileOutputStream fos = new FileOutputStream(file);
		//write data into workbook
		wb.write(fos);
		
		//close the file write mode
		fos.close();
		//close the excel workbook
		wb.close();
		
		
		
	}
	
	@Test(dependsOnMethods = "getCredentials")
	public void naukriLogin() throws InterruptedException, IOException {
		openApplication("chrome", "https://www.naukri.com/");
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

package com.training.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ExceptionHandleTryCatch {

	String username = "";
	String password = "";

	@Test(alwaysRun = true)
	public void getCredentials() {
		try {
		File file = new File("excelfiles\\credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		
		//read property file data
		Properties prop = new Properties();
		prop.load(fis);
				
		} catch(FileNotFoundException fe) {
			System.out.println("file is not available");
			fe.printStackTrace();
		} catch(IOException ie){
			System.out.println("not loading to read");
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}

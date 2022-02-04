package com.training.selenium;

import java.util.Set;

import org.openqa.selenium.By;

public class WindowHandle extends TestBase {

	public void handleWindow() throws InterruptedException {
		openApplication("chrome", "http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();

		driver.findElement(By.xpath("//a[text()='Windows']")).click();

		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
		// get the parent widnow id
		String parent_window_id = driver.getWindowHandle();
		System.out.println("parent window id-->" + parent_window_id);// abc123

		driver.findElement(By.xpath("//div[@id='Seperate']/button")).click();

		Set<String> totalWindows = driver.getWindowHandles();
		System.out.println("total windows are avaialble-->" + totalWindows.size());// 2
		// abc123 //abc124

		for (String win : totalWindows) {
			System.out.println("window id's-->" + win);// abc124

			if (!win.equals(parent_window_id)) { // !abc124.eqauls(abc123)
				// switch to window
				driver.switchTo().window(win);// switch to child window
				String title = driver.getTitle();// child window title
				System.out.println("child window title-->" + title);

				driver.findElement(By.xpath("//span[text()='Downloads']")).click();

				Thread.sleep(4000);
				// close child window
				driver.close();

			}
		}//for loop end

		// switch back to parent window
		driver.switchTo().window(parent_window_id);
		// click Home button on parent window
		driver.findElement(By.xpath("//a[text()='Home']")).click();

		Thread.sleep(4000);
		driver.quit();// closing the parent window

	}

	public static void main(String[] args) throws InterruptedException {
		WindowHandle wh = new WindowHandle();
		wh.handleWindow();

	}

}

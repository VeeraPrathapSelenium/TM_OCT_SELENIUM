package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//set chrome driver path
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		
		//launch your browser
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://demo.nopcommerce.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//click on the register link
		
		driver.findElement(By.linkText("Register")).click();
		
		//enter data into firstname
		
		driver.findElement(By.id("FirstName")).sendKeys("Hello");
		
		

	}

}

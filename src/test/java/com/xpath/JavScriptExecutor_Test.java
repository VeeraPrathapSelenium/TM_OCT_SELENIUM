package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class JavScriptExecutor_Test {

	public static void main(String[] args) {
		GenericMethods genericmethod=new GenericMethods();
		String url="https://demo.nopcommerce.com/register?returnUrl=%2F";
		genericmethod.launchBrowser("chrome", url);
		
		
		WebElement register=genericmethod.driver.findElement(By.cssSelector("#register-button"));
		
		
		JavascriptExecutor js=(JavascriptExecutor) genericmethod.driver;
		js.executeScript("arguments[0].click();", register);
		
		 genericmethod.driver.close();
		 
		 genericmethod.launchBrowser("chrome", url);
		
		
		
	}

}

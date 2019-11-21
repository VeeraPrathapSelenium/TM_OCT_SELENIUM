package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class RegisterNewUser {

	public static void main(String[] args) throws InterruptedException {
		
		
		GenericMethods genericmethod=new GenericMethods();
		String url="https://demo.nopcommerce.com/register?returnUrl=%2F";
		genericmethod.launchBrowser("chrome", url);
		
		WebElement register=genericmethod.driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		
		genericmethod.hoverAndClick("Register", "Home Page", register);
		
	}
}

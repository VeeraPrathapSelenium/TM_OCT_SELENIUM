package com.xpath;

import org.openqa.selenium.By;

import com.genericmethods.GenericMethods;

public class IdentifyRelativeElement_HandleOtherElement {

	public static void main(String[] args) {
		GenericMethods genericmethod=new GenericMethods();
		String url="https://demo.nopcommerce.com/register?returnUrl=%2F";
		genericmethod.launchBrowser("chrome", url);
		
		
		genericmethod.driver.findElement(By.xpath("//label[text()='First name:']/following-sibling::input")).sendKeys("FirstName");
		
		

	}

}

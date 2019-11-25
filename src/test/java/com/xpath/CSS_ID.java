package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class CSS_ID {

	public static void main(String[] args) {
		
	
		GenericMethods genericmethod=new GenericMethods();
		String url="https://demo.nopcommerce.com/register?returnUrl=%2F";
		genericmethod.launchBrowser("chrome", url);
		
		//identify the first name
		
		genericmethod.driver.findElement(By.cssSelector("#FirstName")).sendKeys("First Name");
	
		//identify the lastname
		genericmethod.driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("First Name");
		
		
		//Print all the child using css
		List<WebElement> alloptions=genericmethod.driver.findElements(By.cssSelector("select[name$='DateOfBirthDay']>option"));
		for (WebElement webElement : alloptions) {
			
			System.out.println(webElement.getText());
			
		}
		
		System.out.println("************************************");
		
		genericmethod.driver.findElement(By.cssSelector("select[name$='DateOfBirthDay']>option:nth-child(6)")).click();
		
		
	
	}

}

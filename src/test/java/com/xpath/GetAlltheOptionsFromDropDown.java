package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.genericmethods.GenericMethods;

public class GetAlltheOptionsFromDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		GenericMethods genericmethod=new GenericMethods();
		String url="https://demo.nopcommerce.com/register?returnUrl=%2F";
		genericmethod.launchBrowser("chrome", url);
		
		WebElement register=genericmethod.driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		
		genericmethod.hoverAndClick("Register", "Home Page", register);
		
		List<WebElement> alloptions=genericmethod.driver.findElements(By.xpath("//select[@name='DateOfBirthDay']/child::option"));
		
		for (WebElement option : alloptions) {
			
			System.out.println(option.getText());
			
		}
		
		System.out.println("**************************************");

WebElement day=genericmethod.driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));		


Select day_dropdown=new Select(day);

		
List<WebElement> alloptions_2=day_dropdown.getOptions();
		
		for (WebElement option : alloptions) {
			
			System.out.println(option.getText());
			
		}
		
		
	}
}

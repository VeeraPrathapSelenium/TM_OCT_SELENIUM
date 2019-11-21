package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class HanleDropDownWithXPathCSS {

	public static void main(String[] args) throws InterruptedException {
		
		
		GenericMethods genericmethod=new GenericMethods();
		String url="https://demo.nopcommerce.com/register?returnUrl=%2F";
		genericmethod.launchBrowser("chrome", url);
		
		WebElement register=genericmethod.driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		
		genericmethod.hoverAndClick("Register", "Home Page", register);
		
		List<WebElement> all_Siblings=genericmethod.driver.findElements(By.xpath("//option[text()='2']/following-sibling::option"));
		
		
		for (WebElement option : all_Siblings) {
			
			System.out.println(option.getText());
			
		}
	
		//Find the preceeding siblings from option 31
		System.out.println("\t\t==========================================");
		
	List<WebElement> all_Preceding_Siblings=genericmethod.driver.findElements(By.xpath("//option[text()='31']/preceding-sibling::option"));
		
		
		for (WebElement option : all_Preceding_Siblings) {
			
			System.out.println(option.getText());
			
		}
		
		
     
		
		
		
		
		
	}
}

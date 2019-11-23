package com.xpath;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class GetTextChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericMethods genericmethod=new GenericMethods();
		String url="https://talentzing.com";
		genericmethod.launchBrowser("chrome", url);
		
		List <WebElement> elet = genericmethod.driver.findElements(By.xpath("//h4[text()='Support']/parent::div//child::li/a"));
		
		for (WebElement webElement : elet) {
			System.out.println(webElement.getAttribute("innerHTML"));
			
			//System.out.println(webElement.getAttribute("textcontent"));
			
			//System.out.println(webElement.getAttribute("innertext"));
		}
		

	}

}

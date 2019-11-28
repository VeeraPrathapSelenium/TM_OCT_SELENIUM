package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class HandleAjax {

	public static void main(String[] args) throws InterruptedException {
		GenericMethods genericmethod=new GenericMethods();
		String url="https://in.search.yahoo.com/";
		genericmethod.launchBrowser("chrome", url);
		
		WebElement searchBox=genericmethod.driver.findElement(By.xpath("//input[@id='yschsp']"));
		genericmethod.clickAndSendData("Search Box", "Yahoo Search", searchBox, "india");
		
		Thread.sleep(2000);
		
		List<WebElement> searchResults=genericmethod.driver.findElements(By.xpath("//input[@id='yschsp']/following-sibling::div//li"));
		
		
		for (WebElement webElement : searchResults) {
			
			System.out.println(webElement.getText());
			
		}
		
		
	}

}

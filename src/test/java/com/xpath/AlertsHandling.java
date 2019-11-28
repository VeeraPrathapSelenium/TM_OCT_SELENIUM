package com.xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		GenericMethods genericmethod=new GenericMethods();
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		genericmethod.launchBrowser("chrome", url);
		Thread.sleep(3000);
		WebElement element=genericmethod.driver.findElement(By.xpath("//input[@name='proceed']"));
		element.click();
		Thread.sleep(1000);
		
		
		Alert alert=genericmethod.driver.switchTo().alert();
		alert.accept();
		
		
		
		
		
		

	}

}

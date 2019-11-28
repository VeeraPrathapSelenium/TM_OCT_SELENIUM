package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.genericmethods.GenericMethods;

public class Handle_Iframe {

	public static void main(String[] args) {

		GenericMethods genericmethod=new GenericMethods();
		String url="https://jqueryui.com/droppable/";
		genericmethod.launchBrowser("chrome", url);
		
		//identify the iframe and switch to it
		
		WebElement iframe=genericmethod.driver.findElement(By.xpath("//iframe"));
		
		genericmethod.driver.switchTo().frame(iframe);
		
		WebElement src=genericmethod.driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dest=genericmethod.driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions acc=new Actions(genericmethod.driver);
		
		acc.dragAndDrop(src, dest).build().perform();
		
		genericmethod.driver.switchTo().defaultContent();

	}

}

package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class GetTotalNumberOfLinks {

	public static void main(String[] args) throws InterruptedException {
		
		
		int displayedLinks=0;
		int notDisplayedLinks=0;
		GenericMethods genericmethod=new GenericMethods();
		String url="https://www.amazon.in/";
		genericmethod.launchBrowser("chrome", url);
		
		Thread.sleep(2000);
		//collect all links
		
		List<WebElement> alllinks=genericmethod.driver.findElements(By.xpath("//a"));
		
		System.out.println(alllinks.size());
		
		for (WebElement link : alllinks) {
			
			try
			{
				if(link.isDisplayed())
				{
					displayedLinks++;
					String linktext=link.getText();
					
					if(!linktext.isEmpty())
					{
						System.out.println(linktext);
					}
					
				}else
				{
					notDisplayedLinks++;
				}
				
				
			}catch(Exception e)
			{
				notDisplayedLinks++;
			}
			
			
			
		}
		
		System.out.println("Displayed Links "+displayedLinks);
		
	}

}

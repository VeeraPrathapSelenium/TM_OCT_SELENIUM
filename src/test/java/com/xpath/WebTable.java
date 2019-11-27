package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class WebTable {

	public static void main(String[] args) {
		GenericMethods genericmethod=new GenericMethods();
		String url="https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose";
		genericmethod.launchBrowser("chrome", url);
		
		String xpath="//th[text()='Company']/ancestor::table/tbody/child::tr";
		
		List<WebElement>total_rows=genericmethod.driver.findElements(By.xpath(xpath));
		System.out.println(total_rows.size());
		
		
		for(int r=1;r<=total_rows.size();r++)
		{
			
			String col=xpath+"["+r+"]/td[1]";
			WebElement cellData=genericmethod.driver.findElement(By.xpath(col));
     		//System.out.println(cellData.getText());				
			
     		if(cellData.getText().trim().contentEquals("Lakshmi Machines"))
     		{
     			System.out.println("The Row number :"+r);
     			
     			cellData.click();
     			
     			System.out.println(genericmethod.driver.getCurrentUrl());
     			
     			genericmethod.driver.navigate().back();
     			
     		/*	
     			WebElement group=genericmethod.driver.findElement(By.xpath(xpath+"["+r+"]/td[2]"));
     			
     			WebElement prevClose=genericmethod.driver.findElement(By.xpath(xpath+"["+r+"]/td[3]"));
     			
     			WebElement currentPrice=genericmethod.driver.findElement(By.xpath(xpath+"["+r+"]/td[4]"));
     			
     			WebElement change=genericmethod.driver.findElement(By.xpath(xpath+"["+r+"]/td[5]"));
     			
     			
     			System.out.println("Group :"+group.getText()
     					+ "Prev Close :"+prevClose.getText()
     					+ "Current Price :"+currentPrice.getText()
     					+ "% Change :"+change.getText()
     					+ "");
     			
     			
     		*/	
     			break;
     		}
     		
     		
     		
     		
			//List<WebElement>total_cols=genericmethod.driver.findElements(By.xpath(col));
			
//			for(int c=1;c<=total_cols.size();c++){
//				
//				String data=col+"["+c+"]";
//				
//				WebElement cellData=genericmethod.driver.findElement(By.xpath(data));
//				System.out.println(cellData.getText());
//				System.out.println("**************************************************");
//				
//				
//			}	
//			
			
			
		}
		
		

	}

}

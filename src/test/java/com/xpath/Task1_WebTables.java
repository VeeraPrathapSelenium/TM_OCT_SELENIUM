package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericmethods.GenericMethods;

public class Task1_WebTables {

	public static void main(String[] args) throws InterruptedException {
		


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
     					
			cellData.click();
			//Thread.sleep(2000);
			
			genericmethod.driver.navigate().back();
			//Thread.sleep(2000);
			
			total_rows=genericmethod.driver.findElements(By.xpath(xpath));
     		

	}

}}

package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.genericmethods.GenericMethods;

public class CommonAnnotation extends GenericMethods{
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Launch Application");
		String url="https://demo.nopcommerce.com/";
		launchBrowser("chrome", url);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Close application");
		closeBrowser();
	}

}

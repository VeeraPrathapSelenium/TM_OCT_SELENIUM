package com.testng;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.excelparser.ExcelParser;
import com.genericmethods.GenericMethods;
import com.readingpropertiesfile.ReadingPropertiesFiles;

public class CommonAnnotation extends GenericMethods{
	
	SoftAssert softAssert=new SoftAssert();	
	
	@BeforeMethod
	public void beforeMethod(Method m)
	{
		System.out.println(m.getName());
		/*
		System.out.println("Launch Application");
		String url="https://demo.nopcommerce.com/";
		launchBrowser("chrome", url);*/
	}
	
	@AfterMethod
	public void afterMethod()
	{/*
		System.out.println("Close application");
		closeBrowser();*/
	}

	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		ExcelParser excelparser=new ExcelParser();
		excelparser.loadExcelFile();
		ReadingPropertiesFiles properties=new ReadingPropertiesFiles();
		properties.loadPropertiesFile();
	}
	
	
}

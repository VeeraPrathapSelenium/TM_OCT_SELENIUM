package com.genericmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethods {
	
	public static WebDriver driver;
	
	
	public boolean  launchBrowser(String browser,String url)
	{
		boolean status=true;
		System.out.println("Launching browser :"+browser.toLowerCase());
		try
		{
			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
				driver=new ChromeDriver();
				break;
				
			case "ff":
				//System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
				driver=new FirefoxDriver();
				break;

			default:
				break;
			}
			
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println("Browser "+browser+" is launched sucessfully");
			
		}catch(Exception e)
		{
			status=false;
			e.getStackTrace();
			System.out.println("Browser is not launched sucessfully "+e.getMessage());
		}
		return status;
		
		
		
		
	}
	
	public boolean checkElementExist(String elementName,String pageName,WebElement element)
	{
		boolean status=true;
		try
		{
			if(element.isDisplayed())
			{
				System.out.println("The Element "+elementName+" is displayed on "+pageName);
			}
			
			
		}catch(Exception e)
		{
			status=false;
			System.out.println("The Element "+elementName+" is not displayed on "+pageName);
		}
		return status;
		
		
	}

}

package com.xpath;

import java.util.Iterator;
import java.util.Set;

import com.genericmethods.GenericMethods;

public class Window_Handling {

	public static void main(String[] args) {

		GenericMethods genericmethod=new GenericMethods();
		String url="https://www.naukri.com/";
		genericmethod.launchBrowser("chrome", url);
		
		//collect parent window
		
		String parentWindow=genericmethod.driver.getWindowHandle();
		
		//collect all the windows including parent window
		System.out.println(parentWindow);
		Set<String> allWindows=genericmethod.driver.getWindowHandles();
		
		
		Iterator itr=allWindows.iterator();
		
		while(itr.hasNext()){
			
			String crntWindow=itr.next().toString();
			
			if(!crntWindow.equals(parentWindow))
			{
				genericmethod.driver.switchTo().window(crntWindow).close();
			}
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}

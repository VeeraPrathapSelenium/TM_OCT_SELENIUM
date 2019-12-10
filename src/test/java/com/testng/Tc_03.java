package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc_03 {
	
	
	@Test(dataProviderClass=com.testng.DataProviderClass_Test.class,dataProvider="login")
	public void testDataProvider(String userName,String passWord)
	{
		System.out.println(userName);
		System.out.println(passWord);
	}
	
	
	

}

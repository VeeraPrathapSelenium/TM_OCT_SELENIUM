package com.testng;

import org.testng.annotations.DataProvider;

public class DataProviderClass_Test {
	
	@DataProvider(name="login")
	public Object[][] getLoginCredentials()
	{
		Object[][] login=new Object[2][2];
		
		//1st row 1st col
		login[0][0]="User01";
		login[0][1]="Password1";
		
		
		//2nd row 1st col
		login[1][0]="User02";
		login[1][1]="Password2";
		
		
		
		return login;
		
	}
	
	@DataProvider(name="Admin_login")
	public Object[][] getAdminLoginCredentials()
	{
		Object[][] login=new Object[2][2];
		
		//1st row 1st col
		login[0][0]="User01";
		login[0][1]="Password1";
		
		
		//2nd row 1st col
		login[1][0]="User02";
		login[1][1]="Password2";
		
		
		
		return login;
		
	}
	
	

}

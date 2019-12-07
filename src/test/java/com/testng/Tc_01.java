package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc_01 extends CommonAnnotation{
	
	
	
	
	@Test(testName="Dektop Validation",description="This test case will validate the price of a desktop module")
	public void login()
	{
		System.out.println("Login");
	}
	
	
	
	

}

package com.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc_01 extends CommonAnnotation{
	
	
	
	
	@Test(testName="Dektop Validation",description="This test case will validate the price of a desktop module",priority=1,groups="smoke")
	public void login()
	{
		/*String actualTitle=driver.getTitle();
		
		String expectedTitle="Give a moment...";
		
		
		softAssert.assertEquals(actualTitle, expectedTitle,"Verify page title");
		
		
		softAssert.assertAll();
		*/
	}
	
	@Test(priority=2,groups="E2E")
	public void testCase2()
	{
		System.out.println("Test Case 2");
	}
	
	@Test(priority=3,groups="regression")
	public void testCase3()
	{
		System.out.println("Test Case 3");
	}
	
	

}

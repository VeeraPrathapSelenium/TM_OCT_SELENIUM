package com.testng;

import org.testng.annotations.Test;

public class Tc_02 extends CommonAnnotation{
	
	@Test(testName="Digital Validation",description="This test case will validate digital validation module")
	public void login()
	{
		System.out.println("Login");
	}

}

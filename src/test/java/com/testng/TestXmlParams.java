package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestXmlParams {
	@Test
	@Parameters({"Browser","Env"})
	public void testParams(String browser,String env)
	{
		System.out.println(browser);
		System.out.println(env);
	}

}

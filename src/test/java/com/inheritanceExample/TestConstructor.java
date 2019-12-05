package com.inheritanceExample;

public class TestConstructor extends School {
	
	TestConstructor()
	{
		this("Hello");
		System.out.println("Child class constructor");
	}
	
	TestConstructor(String message )
	{
		System.out.println("Child class paremter constructor");
	}
	

	public static void main(String[] args) {
		
		TestConstructor tc=new TestConstructor();

	}

}

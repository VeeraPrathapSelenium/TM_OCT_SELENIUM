package com.methodoverriding;

public class Parent {
	
	public String add(int a,int b)
	{
		System.out.println("I am testing overriding");
		System.out.println(a+b);
		return String.valueOf(a+b);
	}
	
	

}

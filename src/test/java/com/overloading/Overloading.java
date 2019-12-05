package com.overloading;

public class Overloading {

	public static void main(String[] args) {
		
		Overloading ro=new Overloading();
	
	}
	
	
	 void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	public int add(int a,int b,int c)
	{
		System.out.println(a+b);
		return a+b+c;
	}
	
	protected String add(int a,int b,int c,int d)
	{
		System.out.println(a+b);
		return String.valueOf((a+b+c));
	}
	
	
	
	
	
	
	
	

}

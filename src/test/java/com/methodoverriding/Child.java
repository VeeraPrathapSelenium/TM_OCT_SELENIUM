package com.methodoverriding;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child c=new Child();
		
		Parent p=new Child();
		
		
		System.out.println(p.add(10, 20));
		
		

	}
	
	public String add(int a, int b)
	{
		return"";
	}
	
	
	
	

}

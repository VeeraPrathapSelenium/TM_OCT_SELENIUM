package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class PopulateData {

	public static void main(String[] args) {
		
		List<TestDataVo> lisTestData=new ArrayList<>();
		
		
		
		lisTestData.add(new TestDataVo(
				
	"M","FirstName","LastName","01","Jan","1990","abc.xyz@gmail.com","P1","P1"		
				
				
				));
		
		lisTestData.add(new TestDataVo(
				
				"F","FirstName1","LastName1","02","Jan","1990","abc.xyz@gmail.com","P1","P1"		
							
							
							));
		
		
		
		System.out.println(lisTestData.get(0).getEmail());
						
		System.out.println(lisTestData.get(1).getFirstName());

	}

}

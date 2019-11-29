package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\tm\\Desktop\\TM_Test\\Results\\29-11-2019","abc.txt");
		
		FileReader fr=new FileReader(f);
		
		BufferedReader bfr=new BufferedReader(fr);
		
		
		String data=bfr.readLine();
		
		while(!(data==null))
		{
			System.out.println(data);
			data=bfr.readLine();
			
			
		}
		
		
		
		
		

	}

}

package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFolder {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\tm\\Desktop\\TM_Test\\Results\\29-11-2019","abc.txt");
		
		FileWriter fw=new FileWriter(f,true);
		
		
		PrintWriter pw=new PrintWriter(fw);
		
		pw.println("Welcome india");
		
		pw.println(123456);
		
		pw.flush();
		pw.close();
		fw.close();
		
		

	}

}

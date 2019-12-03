package com.readingpropertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFiles {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("Configuration.properties");
		
		FileInputStream fis=new FileInputStream(f)	;
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("QA_USER_NAME"));
		
		
		
		
	}

}

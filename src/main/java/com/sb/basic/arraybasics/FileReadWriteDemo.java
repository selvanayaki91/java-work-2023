package com.sb.basic.arraybasics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      File file=new File("/home/selva/Desktop/java/tests.txt");
      file.createNewFile();
      FileWriter writer=new FileWriter(file);
      writer.write(97);
      writer.write(" \n How are you");
      writer.flush();
      writer.close();
		FileReader reader=new FileReader(file);
//	int output=	reader.read();
//	System.out.println(output);
//	while(output!=-1)
//	{
//		System.out.print((char)output);
//		output=reader.read();
//	}
	
		char[] ch=new char[(int)file.length()];
		System.out.println(ch.length);
		reader.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

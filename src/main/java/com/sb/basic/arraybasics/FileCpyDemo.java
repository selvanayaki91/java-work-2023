package com.sb.basic.arraybasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCpyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     InputStream input=new FileInputStream("/home/selva/Desktop/website/purple.jpeg");
	OutputStream output= new FileOutputStream("/home/selva/Desktop/website/pple.jpeg");
	int content=input.read();
	while(content!=-1)
	{
		output.write(content);
		content=input.read();
	}
	output.flush();
	}

}

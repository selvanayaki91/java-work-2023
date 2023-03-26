package com.sb.basic.arraybasics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileBufferReadWrite {
public static void main(String[] args) throws IOException {
	File file=new File("/home/selva/Desktop/java/tests.txt");
	FileWriter fWriter=new FileWriter(file,true);
	BufferedWriter bWriter=new BufferedWriter(fWriter);
//	bWriter.write("Tamil");
//	bWriter.newLine();
//	bWriter.write("English");
//	bWriter.newLine();
//	bWriter.write("Mathematics");
//	bWriter.flush();
//	bWriter.close();
	FileReader fReader=new FileReader(file);
	BufferedReader bReader=new BufferedReader(fReader);
	String line=bReader.readLine();
	int count=0;
	int sentencecount=0;
	int wordcount=0;
	int charcount=0;
	while (line!=null)
	{
		String[] sentence=line.split("[.]");
		sentencecount=sentencecount+sentence.length;
		String[] words=line.split(" ");
		wordcount=wordcount+words.length;
		count++;
		System.out.println(line);
		charcount=charcount+line.length();
		line=bReader.readLine();
	}
	System.out.println("No of line "+count);
	System.out.println("No of sentences "+sentencecount);
	System.out.println("No of words " +wordcount);
	System.out.println("No of characters "+charcount);
	
}
}

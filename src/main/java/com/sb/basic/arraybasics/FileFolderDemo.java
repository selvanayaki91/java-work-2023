package com.sb.basic.arraybasics;

import java.io.File;
import java.io.IOException;

public class FileFolderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file= new File("/home/selva/Desktop/java/java interview questions/Raja/Rani/Mandiiri");
//		System.out.println("Folder present : "+file.exists());
//		file.mkdirs();
//		System.out.println("Folder present : "+file.exists());
//		

//		File file= new File("/home/selva/Desktop/java/java interview questions/Raja/test.txt");
//		boolean present = file.exists();
//		System.out.println(present);
//		if(present==false)
//			try {
//				boolean created=file.createNewFile();
//				System.out.println("File created "+created);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	
		
//		File file= new File("/home/selva/Desktop/java/java interview questions/Raja/test.txt");
//		file.delete();
//		boolean delete=file.exists();
//		System.out.println("file deleted "+delete);
//		
	
	
//		File file= new File("/home/selva/Desktop/java/java interview questions/Raja/test.txt");
//	    file.createNewFile();
//        File newName= new File("/home/selva/Desktop/java/java interview questions/Raja/hakunamatata.txt");
//	    boolean rename= file.renameTo(newName);
//	    System.out.println("Rename succes "+rename);
//	  System.out.println("File name is "+file.getName()); 
//	  System.out.println(file.canExecute());
//	  System.out.println(file.canRead());
//	  System.out.println(file.canWrite());
	
	
		File file= new File("/home/selva/Desktop/java");
//		String[] listOfFilesFolders=file.list();
////		for(int i=0;i<listOfFilesFolders.length;i++)
////		{
////			System.out.println(listOfFilesFolders[i]);
////		}
//	
//	
//		for(String s : listOfFilesFolders)
//		{
//			System.out.println(s);
//		}
	
//	   File[] filefolderList=file.listFiles();
//	   for(File f:filefolderList)
//	   {
//		   if(f.isFile())
//		   {
//			   System.out.println(f);
//		   }
//	   }
//	   File[] filefolderList=file.listFiles();
//	   for(File f:filefolderList)
//	   {
//		   if(f.isDirectory())
//		   {
//			   System.out.println(f);
//		   }
//	   }
		File[] filefolderList=file.listFiles();
		   for(File f:filefolderList)
		   {
			   if(f.isFile())
			   {
				  String fileName= f.getName();
				  int lastDot=fileName.lastIndexOf(".");
			String  extension=fileName.substring(lastDot+1);
			if(extension.equals("png"))
				  if(f.length()>5000)
				System.out.println(fileName +"size : "+f.length());
				  
			   }
		   }
	
	}

}

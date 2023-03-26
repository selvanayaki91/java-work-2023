package com.sb.basic.arraybasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//            File ff= new File("/home/selva/Music");
//           // ff.createNewFile();raja.txt
//           //ff.mkdir();
//         // ff.mkdirs();
//            String[] files=ff.list();
//            for(int i=0;i<files.length;i++)
//    		{
//    			System.out.println(files[i]);
//            
//	}
//            File ff1=new File("/home/selva/Music");
//            File[] file1 = ff1.listFiles();
//            for(int i=0;i<file1.length;i++)
//    		{
//            	//if(file1[i].isDirectory())
//            	if(file1[i].isFile())
//    			System.out.println(file1[i]);
//            	{
//					String name = file1[i].getName();
//					int len = name.length();
//				if(len>5)
//				{
//					String s = name.substring(len-3, len);
//				
//    //System.out.println(s);
//				if(s.equals("pdf"))
//				{
//					System.out.println(name);
//				}
//				}
//				} 
//            
//	}    
		File ff = new File("/home/selva/Desktop/java/gg.txt"); 
//		FileReader fReader = new FileReader(ff);
//		//System.out.println(fReader.read()); 
//		//char ch=(char) fReader.read();
//		//System.out.println(ch);
//		
//		int no = fReader.read();
//						while(no!=-1)
//						{
//						System.out.print((char) no);
//						no = fReader.read();
//						} 
//	
		
//		FileReader fReader = new FileReader(ff);
//		BufferedReader bReader = new BufferedReader(fReader);
//				String no = bReader.readLine();
//				
//		//System.out.println(no);
//				while(no!=null)
//				{
//				System.out.print(no);
//				no = bReader.readLine();
//				} 
		FileWriter fWriter = new FileWriter(ff,true);
		fWriter.write("Sunday");
		fWriter.flush();
		fWriter.close(); 
		
}
}

package com.sb.basic.seleniumtesting;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int-Integer
		 * short-Short
		 */
       List<String> list = new ArrayList<String>();
       list.add("Sandeep");
       list.add("Selva");
       list.add("sai");
       list.add("Pranesh");
       //System.out.println(list.get(2));
//       for(int i=0;i<list.size();i++)
//       {
//    	   System.out.println(list.get(i));
//       }
       list.remove(2);
       System.out.println(list.get(2));
       
       list.set(2, "Tamil");
       for(String str:list)
       {
    	   System.out.println(str);
       }
	}

}

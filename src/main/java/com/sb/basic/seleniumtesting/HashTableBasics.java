package com.sb.basic.seleniumtesting;

import java.util.Hashtable;
import java.util.Map;

public class HashTableBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hashtable<Integer,String> table = new Hashtable<Integer,String>();
	
       table.put(1, "pemba");
       table.put(2, "Selva");
       table.put(3, "Ram");
       System.out.println(table.get(3));
       table.remove(2);
       
       for(Map.Entry<Integer, String>  etr:table.entrySet())
       {
    	   System.out.println(etr.getKey()+ "--" + etr.getValue());
       }
	}

}

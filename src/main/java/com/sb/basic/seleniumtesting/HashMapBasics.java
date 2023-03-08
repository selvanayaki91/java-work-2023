package com.sb.basic.seleniumtesting;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "AA");
        map.put(2, "Ab");
        map.put(3, "Ac");
        map.put(4, "AD");
        map.put(null, "");
        map.put(5, null);
        
        //System.out.println(map.get(3));
        map.remove(3);
        for(Map.Entry<Integer, String> entr: map.entrySet())
        {
        	System.out.println(entr.getKey() + "--"+ entr.getValue());
        }
	}

}

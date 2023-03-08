package com.sb.basic.seleniumtesting;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<String> st = new HashSet<String>();
      st.add("A");
      st.add("B");
      st.add("B");
      st.add("c");
      st.add("c");
      for(String str:st)
      {
    	  System.out.println(str);
      }
      
	}

}

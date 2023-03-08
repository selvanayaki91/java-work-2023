package com.sb.basic.seleniumtesting;

public class String_Basics {

	public static void main(String[] args) {
		String str;//str is object of string class
		str="Selvanayaki@123";
		String s2= "Welcome to Java World";//w is at 0 index, d-20 index.
		String str1="Hello";
		String str2="hello";
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equalsIgnoreCase(str2));
		
//		System.out.println(str.length());
//		System.out.println(s2.length());
//		
//		System.out.println(s2.charAt(2));
//		System.out.println(s2.indexOf("J"));
		
		/*
		 * String is immutable in java (their value cannot be changed
		 * Mutable:StringBuffer, StringBuilder -used to store char sequence.
		 */
		String str3="World";//memory allocation in string pool-m1 is value as world
		str3="Country";//m2 is value as country
		str3="city";
		System.out.println(str3);
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		
//		System.out.println(str1.replaceAll("He", "Me"));
//		System.out.println(str2.contains(str2));
//				
				
				
		

	}

}

package com.sb.basic.seleniumtesting;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       System.out.print("print1");
//       System.out.print("print2     ");
//       System.out.print("Hello ");
//       System.out.print("Friends ");
//       
//       
//	  System.out.println("Welcome to QA automation line1");	 
//	  System.out.println("Welcome to QA automation line2");	  
	sum(40,20);
	subtract(30,5);
	Second.secondMethod();
	Second secobj=new Second();
	secobj.thirdMethod();
	System.out.println(secobj.c);
	}

public static void sum(int a ,int b)
{
	System.out.println(a+b);
}
public static void subtract(int a ,int b)
{
	System.out.println(a+b);
}
}

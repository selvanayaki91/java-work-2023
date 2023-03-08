package com.sb.basic.seleniumtesting;

public class ExceptionHandlingBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---program starts here--");
	   
		try {
		int a=10;
	   System.out.println(a/0);
		}
		catch(Exception ex) {
			System.out.println("Exception is handled");
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("finally block executed");
		}
	   System.out.println("--programme ends here--");
	
	}

}

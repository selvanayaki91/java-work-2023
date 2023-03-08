package com.sb.basic.seleniumtesting;

public class IfElseBasics {

	public static void main(String[] args) {
       //only if
//		int math = 30;
//		if(math<40)
//		{
//			System.out.println("Student is failed in maths");
//		}
		
		//if-else ---two condition
//		int math1=55;
//		if(math<40)
//		{
//			System.out.println("Student failed in maths");
//		}else
//			System.out.println("Student passed in maths");
//		
	
		//if_else_if ---multiple condition 
//		int math=45;
//		if(math>80)
//		{
//			System.out.println("Student is passed with 1st division");
//		}else if(math>60 &&math<80)
//		{
//			System.out.println("Student is passed with 2nd division");
//		}else if(math>40 &&math<60)
//		{
//			System.out.println("Student is passed with 3rd division");
//		}else
//		{
//			System.out.println("Studetn is failed in maths");
//		}
		
		//nested if_else__multiple condition
		int math=70;
		if(math>40)
		{
		   if(math>80)
		   {
			   System.out.println("1st Division");
		   }else if(math>60 && math<80) {
			   System.out.println("2nd division");
		   }else {
			   System.out.println("3rd division");
		   }
		}else
		   {
			   System.out.println("Failed");
		   }
	}

}

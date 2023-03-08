package com.sb.basic.seleniumtesting;

public class LoopBasics {

	public static void main(String[] args) {
//     System.out.println("1");
//     System.out.println("2");
//     System.out.println("3");
		
		//whenever we have repeated action that space we need to go for loop
//		for(int i=1;i<=10;i++)
//		{
//			System.out.print(i + " ");
//		}
		
//		for(int i=10;i>=1;i--)
//		{
//			//i=i-1;
//			System.out.print(i + " ");
//			i=i-1;
//		}
		
//		int x=1;
//		while(x<=5)
//		{
//			System.out.print(x + " ");
//			x++;
//		}
	//do_while
		
//		int  y=1;
//		do
//		{
//			System.out.print(y + " ");
//			y++;
//		}while(y<=10);
//	
	int[] ar = { 1,2,3,4,5,5,6};
//	for(int value:ar)
//	{
//		System.out.print(value + " ");
//	}
	
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i] + " ");
	}
	
	
	String[] str= {"Selva" , "Samy", "Sai", "Sri"};
	
	for(String name:str)
	{
		System.out.print(name + " ");
	}
	}
}

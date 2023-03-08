package com.sb.basic.pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Pattern5 patObj = new Pattern5();
      //patObj.print_4();
     // patObj.print_shape();
      //patObj.pattern1();
      patObj.pattern2();
      
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		String s = "abcd";
		
		
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int row_end=sc.nextInt();
		for(int row=1; row<=row_end; row++)
		{
		for(int star=1; star<=5-row; star++)
		    {
		        System.out.print("  "); 
		    }
		for(int col=1; col<=row; col++)
			{
			System.out.print(col+"   ");
			}
		System.out.println(); 
		}
	}

	private void print_shape() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		for(int star=1; star<=5-row; star++)
		    {
		        System.out.print("  "); 
		    }
		for(int col=1; col<=row; col++)
			{
			System.out.print(col+"   ");
			}
		System.out.println(); 
		}
	}

	private void print_4() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		for(int star=1; star<=5-row; star++)
		    {
		        System.out.print("  "); 
		    }
		for(int col=1; col<=row; col++)
			{
			System.out.print(col+" ");
			}
		System.out.println(); 
		}
	}

}

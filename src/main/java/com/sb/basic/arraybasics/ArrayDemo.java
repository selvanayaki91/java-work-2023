package com.sb.basic.arraybasics;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo arryObj = new ArrayDemo();
		//arryObj.printNum();
		//arryObj.printNum1();
		//arryObj.printName();
		//arryObj.printTotalValue();
		//arryObj.linear_search();
		//int[] purse = {10, 50,20, 100, 200, 2000}; 
		//arryObj.linear_search1(purse);
		//int[] purse = {1,2,5,1,2,5,1,2,5,10, 5,10}; 
		//arryObj.count_of_given_value(purse);
		//arryObj. find_repeated_balls();
		
		

	}

	private void find_repeated_balls() {
		// TODO Auto-generated method stub
		char[] balls = {'y', 'g', 'y', 'b', 'r'}; 
		int len = balls.length; 
		char[] result = new char[len];
		int j = 0; 
		while(j<balls.length)
		{
			
		char first = balls[j]; 
		int i;
		for(i=j+1; i<balls.length; i++)
		{
		if(first != balls[i]) 
		    {
		    continue; 
			}
		else
		    {
		    result[j] = 'Y';
		    }
		}
		if(result[j]!='Y')
		{
		result[j] = 'N'; 
		System.out.println(first + " is not repeated");
		}
		else
		{
			System.out.println(first + " is repeated");
		
		}j++;
		}
	}

	private void count_of_given_value(int[] purse) {
		// TODO Auto-generated method stub
		int value = 5;
		int count = 0;
		for (int i = 0; i < purse.length; i++) {
			if (value == purse[i]) {
				count++;
			}
		}
		System.out.println(count);	
		} 
	


	private void linear_search1(int[] purse) {
		// TODO Auto-generated method stub
		//int[] purse = {10, 50,20, 100, 200, 2000}; 
        //  0   1   2   3   4     5
		int change = 500;
		int i = 0;
		boolean present = false; 
		while (i < purse.length) 
		{
			if (change == purse[i]) {
				System.out.println("Yes, I have");
				present = true; 
				break;
			}
			i++;
		}
		if(present == false)
		{
			System.out.println("No value is present");
		}
	}

	private void linear_search() {
		// TODO Auto-generated method stub
		int[] purse = {10, 50,20, 100, 200, 2000}; 
        //  0   1   2   3   4     5
		int change = 20;
		int i = 0;
		while (i < purse.length) {
			if (change == purse[i]) {
				System.out.println("Yes, I have");
				break;
			}
			i++;
		}
		
	}

	private void printTotalValue() {
		// TODO Auto-generated method stub
		int[] marks = new int[5];
		Scanner sc= new Scanner(System.in);
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter Mark ");
			marks[i] =sc.nextInt();
			total=total+marks[i];
		}
		System.out.println("Total is " + total);
		System.out.println("Percentage is " + total/marks.length);
	}

	private void printName() {
		// TODO Auto-generated method stub
		String[] marks = new String[10];
		for(int i=0;i<marks.length;i++)
		{
		System.out.println(marks[i]);
		
		}
		
		
	}

	private void printNum1() {
		// TODO Auto-generated method stub
		int[] marks= new int[15];
		//System.out.println(marks.length);
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<marks.length;i++)
		{
			//System.out.print(marks[i] + " ");
			System.out.println("Enter Mark: ");
			marks[i] = sc.nextInt();
		}System.out.println(marks);
		
		
	}

	private void printNum() {
		// TODO Auto-generated method stub
		int[] num= { 1,2,0,3,4,5,0,1,2};
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			//System.out.print(num[i]+ " ");
			
			//count=count+1;
			if(num[i]==0)
			{
				count=count+1;
				
			}
		}
		//System.out.println();
		//System.out.println("The length count is " + count);
		
	}

}

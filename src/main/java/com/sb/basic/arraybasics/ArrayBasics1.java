package com.sb.basic.arraybasics;

public class ArrayBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayBasics1 arr = new ArrayBasics1();
		//arr.linear_search_num();
		//arr.find_repeated_balls();
		arr.find_repeated_balls_11();

	}

	private void find_repeated_balls_11() {
		// TODO Auto-generated method stub
		char[] balls = {'y','g','b','r','b','g','b','y','g'};
		
		int len=balls.length;
		int[] indicator=new int[len];
		char[] result = new char[len];
		int j=0;
		while(j<balls.length)
		{
			int count=1;
		char first= balls[j];
		
		int i;
		
		for(i=j+1;i<balls.length;i++)
		{
			if(first!=balls[i])
			{
				continue;
				
			}else
			{
				count=count+1;
				result[j]='y';
				indicator[i] =-1;
			}
		}
				
		if(result[j]!='y')
		{
			result[j]='N';
			
			
			//System.out.println(first+ "is not repeated");
		}else
		{
			if(indicator[j]!=-1) {
			System.out.println(first + "is repeated  " + count+"times");
		}
		}
		j++;
		}
	}

	private void find_repeated_balls() {
		// TODO Auto-generated method stub
		//check only first balls.
		char[] balls = {'y','g','b','r','y'};
		int len=balls.length;
		int j=0;
		char first= balls[j];
		char[] result = new char[len];
		int i;
		for(i=1;i<balls.length;i++)
		{
			if(first!=balls[i])
			{
				continue;
				
			}else
			{
				result[j]='y';
			}
		}
				
		if(result[j]!='y')
		{
			result[j]='N';
			System.out.println(first+ "is not repeated");
		}else
		{
			System.out.println(first + "is repeated");
		}
		
		
	}

	private void linear_search_num() {
		// TODO Auto-generated method stub
		int[] num= {10,20,30,40,50,70,80};
		int value=10;
		boolean present = false;
		for(int i=0;i<num.length;i++)
		{
			if(value==num[i])
			{
				System.out.println("yes, I have");
				present = true;
				break;
			}
			
		}if(present ==false)
		{
			System.out.println("no");
		}
		
	}

}

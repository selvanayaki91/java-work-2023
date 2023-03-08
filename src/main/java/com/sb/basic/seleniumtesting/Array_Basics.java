package com.sb.basic.seleniumtesting;

public class Array_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //declaration
		int [] arr = new int [5];//size of an array[5]
		arr[0]=101;
		arr[1]=102;
		arr[2]=103;
		arr[3]=104;
		arr[4]=105;
		//arr[5]=106;//it s not allowed intialize extra value.
		
		System.out.println(arr[3]);
		String[] str= new String[2];
		str[0]="Selva";
		str[1]="Sai";
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		int [] obj= {10,20,30,40};//declaration and initialization in single row.
		System.out.println(obj[0]);
	}

}

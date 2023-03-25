package com.sb.basic.arraybasics;

import java.util.Scanner;

public class UsernameValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input=new Scanner(System.in);
         System.out.println("Enter the username : ");
         String username= input.next();
         int a = username.length();
         System.out.println("the length is :"+a);
         char[] un=username.toCharArray();
         int count=0;
         int count2=0;
         int count3=0;
         
         for(int i=0;i<un.length;i++)
         {
        	 if((un[i]>='A'&&un[i]<='Z')||(un[i]>='a'&&un[i]<='z')||(un[i]>='1'&&un[i]<='9')||(un[i]>=45&&un[i]<=46))
        	 {
        		 count++;
        	 }else
        	 {
        		 count2++;
        	 }
        	 if((un[i]>='A'&&un[i]<='Z')||(un[i]>='a'&&un[i]<='z'))
        	 {
        		 count3++;
        	 }
         }
         if(count<1 ||count2>0||count3==0)
         {
        	 System.out.println("The given username is invalid ");
         }else if(a==count)
         {
        	 System.out.println("The given username is valid");
         }else
         {
        	 
         }
	}

}

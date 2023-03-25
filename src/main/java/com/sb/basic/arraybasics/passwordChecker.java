package com.sb.basic.arraybasics;

import java.util.Scanner;

public class passwordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner input=new Scanner(System.in);
          System.out.println("Enter your password: ");
          String password=input.next();
          int a = password.length();
          System.out.println("The given String length is :"+ a);
          char[] pass= password.toCharArray();
          
         int count=0;
         int count2=0;
         int count3=0;
         int count4=0;
          for(int i=0;i<pass.length;i++)
          {
        	  if((pass[i]>='A'&&pass[i]<='Z')||(pass[i]>='a'&&pass[i]<='z')||(pass[i]>='1'&&pass[i]<='9')||(pass[i]>=33&&pass[i]<=38))
        	  {
        		  count++;
        	  }
        	  else
        	  {
        		  count2++;
        	  }
        	  if(pass[i]>='1'&&pass[i]<='9')
        	  {
        		  count3++;
        	  }
        	  if(pass[i]>=33&&pass[i]<=38)
        	  {
        		  count4++;
        	  }
        	  
          }
		System.out.println(count+ "The count");
		if(count2>0||a<8||count3>1||count4>1)
		{
			System.out.println("The given password is invalid");
		}else if(a==8)
		{
			System.out.println("The given password is valid");
		}else if(a>8)
		{
			System.out.println("The given password is invalid");
		}
		
	}

}

package com.sb.basic.arraybasics;

public class GuessGame1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] cpNum= {3,5,1,2};
        int len= cpNum.length;
        int[] GuessNum= {9,5,6,3};
        char[] ch= new char[len];
       
        for(int i=0;i<GuessNum.length;i++)//21
        {
        	for(int j=0;j<cpNum.length;j++)//5372
        	{
        		
        		if(GuessNum[i]==cpNum[j]&&i==j)//1==5
        		{
        			ch[i] ='c';
        			break;
        		}
        		else if(GuessNum[i]==cpNum[j]&&i!=j)
        		{
        			ch[i]='p';
        			break;
        			
        		}
        		else
        		{
        			ch[i]='n';
        		}
        			
        	}
        	
        }for(int i=0;i<ch.length;i++)
        {
        	System.out.println(ch[i]);
        }
        
	}

}

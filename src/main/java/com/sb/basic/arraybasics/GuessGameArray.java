package com.sb.basic.arraybasics;

public class GuessGameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cpNum = {5,8,4,2};
		int[] guessNum= {5,2,3,4};
		char[] ch = {'n','n','n','n'};
		 for(int i=0;i<guessNum.length;i++)
		 {
			for(int j=0;j<cpNum.length;j++)
		     {
				if(guessNum[i]==cpNum[i]) {
			        ch[i]='s';
		      }else
		      {
		    	  if(guessNum[i]==cpNum[j])
		    	  {
		    		  ch[i]='p';
		    	  }
		      }
		     }
		 }for(int i=0;i<ch.length;i++) {
			 System.out.println(ch[i]);
		 }

	}

}

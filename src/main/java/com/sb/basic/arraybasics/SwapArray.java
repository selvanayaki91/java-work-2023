package com.sb.basic.arraybasics;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SwapArray sa = new SwapArray();
      char[] ch1= sa.swapCouple();
      for(int i=0;i<ch1.length;i++)
  		System.out.println(ch1[i]);
	}

	private char[] swapCouple() {
		// TODO Auto-generated method stub
		char[] ch= {'f','m','n','n','m','m'};
		char temp=' ';
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='f'&&i==0)
			{
				 temp=ch[i];
				 ch[i]=ch[i+1];
				 ch[i+1]=temp;
			}
			else if(ch[i]=='n' &&i==2)
			{
				temp=ch[i];
				ch[i]='f';               
				
			}
			else if(ch[i]=='n' && i==3)
			{
				temp=ch[i];
				ch[i]='m';
			}else
			{
				
			}
			
		}
		return ch;
		
	}

}

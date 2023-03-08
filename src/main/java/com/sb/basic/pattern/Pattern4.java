package com.sb.basic.pattern;

public class Pattern4 {
public static void main(String[] args) {
	Pattern4 patObj= new Pattern4();
	patObj.print_B();
	//patObj.print_3();
}

private void print_3() {
	// TODO Auto-generated method stub
	for(int row=1;row<=9;row++)
	{
		for(int col=1;col<=9;col++)
		{
			if(row==1 || row==5 ||row==9 ||col==9 &&row!=1&&row!=5&&row!=9)
			{
			System.out.print("* ");
			}else 
				System.out.print("  ");
		}System.out.println();
	}
	
}

private void print_B() {
	// TODO Auto-generated method stub
	for(int row=1;row<=9;row++)
	{
		for(int col=1;col<=9;col++)
		{
			if(col==1 || row==1 ||row==5 ||row==9 ||col==9)
			{
			System.out.print("* ");
			}else 
				System.out.print("  ");
		}System.out.println();
	}
	
}
}

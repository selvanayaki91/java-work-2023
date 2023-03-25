package com.sb.basic.arraybasics;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         RecursionDemo  rd = new RecursionDemo();
         rd.display(1);
	}

	private void display(int no) {
		// TODO Auto-generated method stub
		System.out.print(no +" ");
		no++;
		if(no<=5)
		{
			display(no);
		}
		
	}

}

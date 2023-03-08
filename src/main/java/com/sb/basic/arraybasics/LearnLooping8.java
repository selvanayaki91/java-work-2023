package com.sb.basic.arraybasics;

public class LearnLooping8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LearnLooping8 ll = new LearnLooping8();
      ll.finacciseries(20);
      //ll.swapwithoutthirdvarible(134,432);
      ll.fibanacciseries1();
	}

	private void fibanacciseries1() {
		// TODO Auto-generated method stub
		int first = 0, second = 1;
		int no =1;
		while(no<=10)
		{
		System.out.println(first);  
		int third = first + second; 

		first = second; 
		second = third; 
		no++;

		}
	}

	private void swapwithoutthirdvarible(int ch1, int ch2) {
		// TODO Auto-generated method stub
		ch2=ch2+ch1;//300
		ch1=ch2-ch1;//300-100=200
		ch2=ch2-ch1;//300-200=100
		System.out.println("The ch1 value is " +ch1);
		System.out.println("The ch2 value is " +ch2);
		
	}

	private void finacciseries(int value) {
		// TODO Auto-generated method stub
		int no1=0;
		int no2=1;
		//System.out.print(no1 + " ");
		//System.out.print(no2 + " ");
		while(no1<=value)
		{
			System.out.print(no1 + " ");
		int no3=no2+no1;
		
		no1=no2;
		no2=no3;
		}
		
	}

}

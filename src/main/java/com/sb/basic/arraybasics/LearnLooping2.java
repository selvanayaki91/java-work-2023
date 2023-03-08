package com.sb.basic.arraybasics;

public class LearnLooping2 {
	public static void main(String[] args) {
		LearnLooping2 ll = new LearnLooping2();
		//ll.print_1111();
		//System.out.println();
		//ll.print_1234();
		//System.out.println();
		//ll.print_13579();
		//System.out.println();
		//ll.print_246810();
		
		//ll.print_3691215();
		//ll.print_369();
		//ll.print_35table();
		//ll.print_multiplies_3and5();
		//ll.print_multiplies_3or5();
		//ll.print_divisors(100);
		ll.countDivisorOfANumber(100);
		//ll.primeNumber(13);
		//ll.notprimeNumber(13456);
	}

	public int notprimeNumber(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		int count = 0; 
		while(div<no)
		{
		if(no%div == 0)
		{
        //System.out.print("Not Prime"); 
		count = count + 1; 
		break;
		}
		div = div + 1; //2 to 99
		
//System.out.println(count);
		}
		//System.out.println(count);
		if(count==0)
		{
			
			System.out.print(no + " ");
		}
		
//		else
//		{
//			System.out.println("Given Number is Not Prime");
//		}
		return no;
	}

	public void primeNumber(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		int count = 0; 
		while(div<no)
		{
		if(no%div == 0)
		{
		
//System.out.print(div+" "); 
		count = count + 1; 
		}
		div = div + 1; //2 to 99
		
//System.out.println(count);
		}
		//System.out.println(count);
		if(count==0)
		{
			System.out.println(no + " is Prime ");
		}
		else
		{
			//System.out.println("Given Number is Not Prime");
		} 
	}

	private void countDivisorOfANumber(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		int count =0;
		while(div<no)
		{
		if(no%div == 0)
		{
		//System.out.print(div+" ");
		count=count+1;
		}
		div = div + 1; 
		System.out.println("The count is " +count);
		} 
	}

	private void print_multiplies_3or5() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=30) {
			if(no%3==0 || no%5==0) {
				System.out.println(no);
				
			}no=no+1;
		}
	}

	private void print_divisors(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		while(div<=no)
		{
		if(no%div == 0)
		{
		System.out.print(div+" "); 
		}
		div = div + 1; 
		} 
	}

	private void print_multiplies_3and5() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=30) {
			if(no%3==0 && no%5==0) {
				System.out.println(no);
				
			}no=no+1;
		}
	}

	private void print_35table() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=10) {
			System.out.print((no*3)+ " ");
			System.out.println((no*5) + " ");
			no=no+1;
		}
		
	}

	private void print_369() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5) {
			System.out.print((no*3)+ " ");
			no=no+1;
		}
		
	}

	private void print_3691215() {
		// TODO Auto-generated method stub
		int no=3;
		while(no<=15) {
			//System.out.println(no);
			System.out.print(no + " ");
			no=no+3;
		}
		
	}

	private void print_246810() {
		// TODO Auto-generated method stub
		int no=2;
		while(no<=10) {
			System.out.println(no);
			no=no+2;
		}
		
	}

	private void print_13579() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=9) {
			System.out.println(no);
			no=no+2;
		}
		
	}

	private void print_1234() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5) {
			System.out.println(no);
			no=no+1;
		}
	}

	private void print_1111() {
		// TODO Auto-generated method stub
		int no_of_times =1;
		while(no_of_times<=5)
		{
			System.out.print(1+ " ");
			no_of_times=no_of_times+1;
		}
	}

}

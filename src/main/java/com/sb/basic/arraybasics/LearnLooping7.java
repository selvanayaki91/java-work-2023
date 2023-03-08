package com.sb.basic.arraybasics;
public class LearnLooping7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      LearnLooping3 ll= new LearnLooping3();
//      int no=1;
//      while(no<=4)
//      {
//    	  int result= ll.find_power(no,3);
//    	  no=no+1;
//    	  System.out.println("The result is " + result);
//      }
		
		LearnLooping7 ll = new LearnLooping7();
		//ll.findSquareRoot(81);
		//ll.decimaltobinary(65);
		//ll.binarytodecimal(11011011);
		//ll.oddpositionprint(123456);
		//ll.evenpositionprint(123456);
		//ll.printNum111121();
		//ll.print182764();
		//ll.print1491625();
		//ll.print149256();
		//ll.findsquareroot2(100);
		//ll.spynumber(2345);
		//ll.productofdigit(1124);
		//ll.sumOfDigitUntilBecomesZero(1234566);
		ll.findsquarerootseries();
		
	}

	private void findsquarerootseries() {
		// TODO Auto-generated method stub
		
			    int no=1;
			    int divisor;
			    while(no<=100)
			    {
			    	findsquareroot2(no);
			    no=no+1;
			    } 
			  }
	

	private void sumOfDigitUntilBecomesZero(int num) {
		// TODO Auto-generated method stub
		LearnLooping3 ll = new LearnLooping3();
		int sum=ll.sumOfDigits(num);
		
		while(sum>9)
		{
		 sum=ll.sumOfDigits(sum);
		}System.out.println("The sum of digit until it becomes zero "+sum);
		
	}

	

	private int productofdigit(int plate) {
		// TODO Auto-generated method stub
		int countOfDigits =0;
		int product=1;
		int sum=0;
		while(plate>0)
		{
			int digitremin=plate%10;
			//System.out.println(plate%10);
			product=product*digitremin;
			countOfDigits=countOfDigits+1;
			plate=plate/10;
	     }
		//System.out.println("Digits count is " + countOfDigits);
		System.out.println("Theproduct of digit is = " + product);
		return product;
		
	}

	private void spynumber(int num) {
		// TODO Auto-generated method stub
		LearnLooping3 ll = new LearnLooping3();
		int sum=ll.sumOfDigits(num);
		int product=productofdigit(num);
		if(sum==product)
		{
			System.out.println("The given number is spy number");
		}else
			System.out.println("The given number is not spy number");
		
		
		
	}

	private void findsquareroot2(int no) {
		// TODO Auto-generated method stub
		int divisor=2;
		while(divisor<no)
		{
		if(no/divisor==divisor && no%divisor==0)
		{
			System.out.println("The square root is " +divisor);
			break;
		}
		divisor=divisor+1;
		
		}
		
	}

	private void print149256() {
		// TODO Auto-generated method stub
		LearnLooping3 ll = new LearnLooping3();
		int num=1;
		int power=2;
		while(num<=10)
		{
			int result =ll.find_power(num, num);
			System.out.println(result);
			num=num+1;
		}
	}

	private void print1491625() {
		// TODO Auto-generated method stub
		LearnLooping3 ll = new LearnLooping3();
		int num=1;
		int power=2;
		while(num<=10)
		{
			int result =ll.find_power(num, power);
			System.out.println(result);
			num=num+1;
		}
	}

	private void print182764() {
		// TODO Auto-generated method stub
		LearnLooping3 ll = new LearnLooping3();
		int num=1;
		while(num<=4)
		{
			int result =ll.find_power(num, 3);
			System.out.println(result);
			num=num+1;
		}
		
		
	}

	private void printNum111121() {
		// TODO Auto-generated method stub
		int num=1;
//		while(num<=1331)
//		{
//			System.out.println(num);
//			num=num*11;
//		}
		int count=1;
		while(count<=6)
		{
				System.out.println(num);
			num=num*11;
			count=count+1;
			}
		
	}

	private void evenpositionprint(int plate) {
		// TODO Auto-generated method stub
		while(plate>0)
		{
			
			int  digitremain=plate%10;
			
		   System.out.println(digitremain);
			plate=plate/100;
	     }
		
	}

	private void oddpositionprint(int num) {
		// TODO Auto-generated method stub
		LearnLooping3 ll = new LearnLooping3();
	int digit=	ll.countOfDigits( num);
	System.out.println(digit);
	}

	private void binarytodecimal(int num) {
		// TODO Auto-generated method stub
		LearnLooping3 ll = new LearnLooping3();
		int power=0;
		int decimal=0;
		while(num>0)
		{
		int rem=num%10;
		int result=rem*ll.find_power(2, power);
		decimal=decimal+result;
		num=num/10;
		power=power+1;
		//System.out.println(result);
		}System.out.println("The decimal value is " +decimal);
		
		
	}

	private void decimaltobinary(int box) {
		// TODO Auto-generated method stub
		//int box = 6; 
		String result = ""; 
		while(box>0)
		{
		int rem = box%2; 
		result = rem + result; 
		box = box / 2; 
		}
		System.out.println("Binary is "+ result);
		
	}

	public int findSquareRoot(int no) {
		// TODO Auto-generated method stub
		int divisor = 2; 
		while(divisor<no)
		{
		if(no/divisor == divisor)
		{
		System.out.println("Square Root is " + divisor); 
		break; 
		}
		divisor = divisor + 1;
		
		}return divisor;
		
	}

}

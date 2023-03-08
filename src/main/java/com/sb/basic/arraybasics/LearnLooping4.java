package com.sb.basic.arraybasics;
public class LearnLooping4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnLooping4 loop= new LearnLooping4();
		loop.sumofmulofthree(1346936);
		//loop.reverseGivenNumber(12345);
		//loop.find_palindrome(1211311);
		//loop.armStrong(371);
		//loop.neonNumber(9);
		//loop.squareOfDigit(9);
//		int no=9;
//		int  p2=loop.find_power(no);
//		int sum =loop.countOfDigits(p2);
//		if(sum==no) {
//			System.out.println("The given number is neon number");
//		}else
//			System.out.println("The given number is not neon number");
		
		
		//loop.additionOfN_Numbers(10);
		
//		loop.strongNumber(145);
//		int factorial=loop.find_factorial(4);
//		//System.out.println("The factorial is " +factorial);
	//	
		loop.perfectNumber(6);
		
		
		}

		private void perfectNumber(int num) {
			// TODO Auto-generated method stub
			int div=1;
			int givnum=num;
			int  num2=0;
			while(num>div)
			{
				if(num%div==0)
				{
					num2=num2+div;
					
				}div=div+1;
			}
			if(givnum==num2)
				{
				System.out.println("The given number is perfect  number");
				}else
					System.out.println("The given number is not perfect number ");
			
		}

		private void strongNumber(int num) {
			// TODO Auto-generated method stub
			int givennum=num;
			int strongnum=0;
			while(num>0)
			{
			int num2=num%10;
			int num3=find_factorial(num2);
			 strongnum=strongnum+num3;
			num=num/10;
			}
			if(givennum==strongnum)
				{
				System.out.println("The given number is Strong number  " );
				}else 
					System.out.println("The given number is not a strong number");
			
			
			
		}

		private int  find_factorial(int num) {
			// TODO Auto-generated method stub
	        int fact=1;
			
			while(num>0) {
				fact=fact*num;
				num=num-1;
			}
			return fact;
		}

		private void additionOfN_Numbers(int num) {
			// TODO Auto-generated method stub
			int sum=0;
			
			while(num>0) {
				sum=sum+num;
				num=num-1;
			}System.out.println("The sum of N number is " +sum);
			
		}

		private int  find_power(int no) {
			// TODO Auto-generated method stub
			return no*no;
		}

		private void squareOfDigit(int plate) {
			// TODO Auto-generated method stub
			int square=0;
			while(plate>0) {
			int rem=plate%10;//1
			square= square+(rem*rem);//4
			plate=plate/10;//1
			}System.out.println("The square ofDigit is  " +square);
			
		}

		private int countOfDigits(int plate) {
			// TODO Auto-generated method stub
			int count=0;
			while(plate>0) {
			int rem=plate%10;
			//System.out.println(rem);
			count = count+rem;
			plate=plate/10;
			}
			System.out.println("The Count Of digit is " +count);
			return count;
			
			
		}

		private void neonNumber(int i) {
			// TODO Auto-generated method stub
			
		}

		private void armStrong(int plate1) {
			// TODO Auto-generated method stub
			int plate2=0;
			int plate3=plate1;
			while(plate1>0)
			{
	        int rem=plate1%10;
			plate2=plate2+(rem*rem*rem) ;
			plate1=plate1/10;
			}System.out.println(plate2);
			
			if(plate3==plate2)
			{
				System.out.println("The given number is Armstrong");
			}else
				System.out.println("The Given number is not Armstrong");
			
		}

		private void find_palindrome(int plate1) {
			// TODO Auto-generated method stub
			int plate2=0;
			int plate3=plate1;
			while(plate1>0)
			{
	        int rem=plate1%10;
			plate2=(plate2*10)+rem ;
			plate1=plate1/10;
			}System.out.println(plate2);
			
			if(plate3==plate2)
			{
				System.out.println("The given number is Palindrome");
			}else
				System.out.println("The Given number is not palindorme");
		}

		private void reverseGivenNumber(int plate1) {
			// TODO Auto-generated method stub
			int plate2=0;
			while(plate1>0)
			{
	        int rem=plate1%10;
			plate2=(plate2*10)+rem ;
			plate1=plate1/10;
			}System.out.println(plate2);
			
			
		}

		private void sumofmulofthree(int num) {
			// TODO Auto-generated method stub
			int count=0;
			while(num>0) 
			{
			int rem=num%10;//6
			if(rem%3==0)
			{
				count=count+rem;
				//System.out.println(rem);
				//6+3+9+6+3
				}num=num/10;//134693
			}System.out.println("The SumOf Multiple 3 is " + count);
	   }
	}



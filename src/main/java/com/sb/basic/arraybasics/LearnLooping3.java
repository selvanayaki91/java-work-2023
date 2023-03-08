package com.sb.basic.arraybasics;

public class LearnLooping3 {
	public static void main(String[] args) {
		LearnLooping3 ll=new LearnLooping3();
		 //ll.printreverse(1986);
		 //int count=ll.countOfDigits(1234453664);
		 //System.out.println(count);
		ll.sumOfDigits(123456);
		//ll.sumOFEvenDigit(12345678);
	      //ll.sumOfDigits1567(1452637);
		//ll.reverseGivenNumber(12345);
		//ll.sumofmulofthree(1346936);
		//ll.find_palindrome(11211);
		//ll.armstrong(371);//371
		
		//ll.find_common_divisors(100,1000);
		//ll.find_lcm(15,45);
		
		//ll.armstrong2(14654);
		//int output =ll.find_power(5,5);
		//System.out.println("The output is " + output);
		
	
		   
	}

	private void armstrong2(int num) {
		// TODO Auto-generated method stub
		int givnum=num;
		int sum2=0;
		int power=countOfDigits(num);
		while(num>0) {
			int base = num%10;//3
		
		int sum= find_power( base, power);
		
		 sum2=sum2+sum;
		 num=num/10;
		}
		if (givnum==sum2)
			{
			System.out.println("The given number is amrstrong");
			}
		else 
			System.out.println("The given number is not armstrong");
	}

	private void find_lcm(int no1, int no2) {
		// TODO Auto-generated method stub
		int big = no1>no2? no1: no2; 
		while(true)
		{
		if(big%no1 ==0 && big%no2==0)
		{
		System.out.println("LCM is " + big); 
		break; 
		}
		big = big + 1;
		} 
	}

	private void find_common_divisors(int no1, int no2) {
		// TODO Auto-generated method stub
		int div = 2; 
		// Ternary Operator
		int small = no1<no2 ? no1: no2;
		
//		if(no1<no2)
//		{
//		small = no1; 
//		}
//		else
//		{
//		small = no2; 
//		}
		int gcd = 0; 
		while(div<=small)
		{
		if(no1%div==0 && no2%div==0)
		{
		
	//System.out.println(div); 
		gcd = div; 
		}
		div = div + 1; 
		}
		System.out.println("GCD is "+ gcd);
	}

	public  int find_power(int base, int power) {
		// TODO Auto-generated method stub
		int result = 1; 
		while(power>0)	{ //5
		result = result * base; //5
		power = power - 1; 
		}
		return result; 
		
	}

	private void armstrong(int plate1) {
		// TODO Auto-generated method stub
		int plate2 = 0; 
		int plate3=plate1;

		while(plate1>0){
		int rem = plate1%10;	//1
		plate2 = plate2 + (rem*rem*rem); //1+125	
		plate1 = plate1/10; 	//15
		}
		//System.out.println(plate1);
		System.out.println(plate2); 
		if(plate3==plate2) {
			System.out.println("Armstrong");
		}else
			System.out.println("Not ArmsTrong");
		
		
		
	}

	private void find_palindrome(int plate1) {
		// TODO Auto-generated method stub
		int plate2 = 0; 
		int plate3=plate1;

		while(plate1>0){
		int rem = plate1%10;	//5
		plate2 = (plate2*10) + rem; //54	
		plate1 = plate1/10; 	//1234
		}
		//System.out.println(plate1);
		System.out.println(plate2); 
		if(plate3==plate2) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not palindrome");
		
	}

	private void sumofmulofthree(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num>0){
		int rem=num%10;
		if(rem%3==0) {
		sum=sum+rem;
		}
		num=num/10;
		}
		System.out.println(sum);
		} 
		
	

	private int reverseGivenNumber(int plate1) {
		// TODO Auto-generated method stub
		 
		int plate2 = 0; 

		while(plate1>0){
		int rem = plate1%10;	//5
		plate2 = (plate2*10) + rem; //54	
		plate1 = plate1/10; 	//1234
		}
		System.out.println(plate2); 
		return plate2;
		
	}

	private void sumOfDigits1567(int no) {
		// TODO Auto-generated method stub
		int sum=0;
		while(no>0)
		{
			int rem=no%10;
			System.out.println(rem);
			if(rem%2==0)
			{
				sum=sum+rem;
			}no=no/100;
		}System.out.println(sum);
		
	}

	private void sumOFEvenDigit(int plate) {
		// TODO Auto-generated method stub
		int countOfDigits =0;
		int sum=0;
		while(plate>0)
		{
			int digitremin=plate%10;
			//System.out.println(plate%10);
			if(digitremin%2==0) {
				sum=sum+digitremin;
			}
			//sum=sum+digitremin;
			//countOfDigits=countOfDigits+1;
			plate=plate/10;
	}
		//System.out.println("Digits count is " + countOfDigits);
		System.out.println("The sum of reminder is = " + sum);
		
	}

	public int sumOfDigits(int plate) {
		// TODO Auto-generated method stub
		int countOfDigits =0;
		int sum=0;
		while(plate>0)
		{
			int digitremin=plate%10;
			//System.out.println(plate%10);
			sum=sum+digitremin;
			countOfDigits=countOfDigits+1;
			plate=plate/10;
	     }
		//System.out.println("Digits count is " + countOfDigits);
		//System.out.println("The sum of digit is = " + sum);
		return sum;
	  }

	public int countOfDigits(int plate) {
		// TODO Auto-generated method stub
		int countOfDigits =0;
		while(plate>0)
		{
			//System.out.println(plate%10);
			countOfDigits=countOfDigits+1;
			plate=plate/10;
	}//System.out.println("Digits count is " + countOfDigits);
	return countOfDigits;
	}

	private void printreverse(int plate) {
		// TODO Auto-generated method stub
		while(plate>0)
		{
			System.out.println(plate%10);
			plate=plate/10;
	}
	
}
}

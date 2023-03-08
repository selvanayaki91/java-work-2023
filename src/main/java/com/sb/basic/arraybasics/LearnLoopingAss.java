package com.sb.basic.arraybasics;
public class LearnLoopingAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnLoopingAss ass = new LearnLoopingAss();
		//ass.findDivisorsOf100(100);
		//ass.findDivisorsof100_OnlyPrime(100);
		//ass.reversePrintingNum(456789);
		//ass.reversePrintingNumber896745(456789);
		//ass.powerfact(2,5);
		//ass.powerfact54321();
		//ass.swapingWithout3Variable(5,6,7);
		//ass.swapingWithout4Variable(5,6,7,8);
		//ass.factorial(5);
		//ass.factorial54321();
		//ass.printing1to100();
		//ass.print182764();
		//ass.print127125();
		//ass.print1427256();
		//ass.print5p44p33p2();
		//ass.binarytodecimal(1101);
		//ass.decimaltobinary(11);
		//ass.binarytoOctal(110101);
		//ass.fibonacciSeries();
		//ass.fibonacciseriesPrimenumbers();
		//ass.first10PrimeNumbers();
		//ass.first20PrimeNumberssum();
		//ass.firstdoubledigitprimeNumber();
		//ass.additionOf20Numbers();
		//ass.fibonacci_series_without_using_3variable();
       // ass.fibonacciSeries5to80();
		//ass.print5101520();
		//ass.print510152048121620();
		//ass.leastCommonMultiple(24,54);
		//ass.print1_11_111_111();
		//ass.find_fact(5);
		//ass.factorial1to10();
		//ass.palindromeNumber(12321);
		//ass.ascendingOrder(46546);
		//---ass.factorialprimeNumberOf2to10();
		//ass.greatestAndSmallestDivisorInSingleLoop();
		//ass.largestDivisorOfNumber();
		//ass.lcmtwoNumber(24,15);
		//ass.lcmTwoNumberif();
		
	}

	private void lcmTwoNumberif() {
		// TODO Auto-generated method stub
		  int a=24,b=15,dv=2,gcd=1;
		    while(a>1 || b>1){
		        if(a% dv==0 || b% dv==0) {
		            if(a%dv==0){
		                a=a/dv;
		            }
		            if(b%dv==0) {
		                b=b/dv;
		            }
		           // int lcm=(a*b)/gcd(a,b);
		            if((a%dv!=0) && (b%dv!=0))
		            {
		                dv=dv+1;
		            }
		        }
		    }
		   // System.out.println(lcm);
		}
		
		
	

	private void lcmtwoNumber(int a, int b) {
		// TODO Auto-generated method stub
		
			
			      int big=a>b?a:b;
			      
			      while(true) {
			        if (big%a==0 && big%b==0 ) {
			        System.out.println(big);
			        break;
			      }
			        big++;
			      }
	}

	private void largestDivisorOfNumber() {
		// TODO Auto-generated method stub
		
		
	}

	private void greatestAndSmallestDivisorInSingleLoop() {
		// TODO Auto-generated method stub
		int no1=100,no2=60;
		int div=2;
		int gcd=0, lcd=0;
		boolean first=true;
		int small=no1<no2? no1:no2;
		
		while(div<=small)
		{
			if(div%no1==0 && div%no2==0)
			{
				if(first==true)
				{
					lcd=div;
					first=false;
				}
				gcd=div;
			}
			System.out.println("Gcd is " +gcd);
		}
		
		
	}

	private void factorialprimeNumberOf2to10() {
		// TODO Auto-generated method stub
		int num=1;
		int div=2;
		while(div<=10)
		{
			if(num%div==0)
			{
				break;
			}div=div+1;
		}
	}

	private void factorial54321() {
		// TODO Auto-generated method stub
		int fact=5;
		while(fact>0)
		{
			factorial( fact	);
			fact=fact-1;
		}
		
	}

	private void ascendingOrder(int num) {
		// TODO Auto-generated method stub
		int rem=0;
		int rem2=0;
		int count=0;
		int sum=0;
		while(num>0)
		{
		rem=num%10;//4
		num=num/10;//123
		sum=sum+1;
		rem2=num%10;
		
		
		if(rem2<rem)
		{
			//System.out.println("The given number is acending number");
		count=count+1;
		}else
			//System.out.println("The given number is not acending order");
		break;
		}if(count==sum)
		{
			System.out.println("The given is acensding order");
		}else
			System.out.println("The given number is not ascending number");
	}

	private void palindromeNumber(int num) {
		// TODO Auto-generated method stub
		int rem=0;
		int givnum=num;
		while(num>0)
		{
			int rem1=num%10;
			rem=(rem*10)+rem1;
			num=num/10;
		}System.out.println("The given numer of reverse is "+ rem);
		if(givnum==rem)
		{
			System.out.println("The number is plaindrome");
		}else
			System.out.println("The given number is not palindrome");
	}

	private int factorial1to10() {
		// TODO Auto-generated method stub
		int num=2;
		int num2=0;
		LearnLooping2 ll = new LearnLooping2();
		
		while(num<=10)
		{
		 num2=ll.notprimeNumber(num);
		num=num+1;
		
		}
		return num2;
		//System.out.println("The first 20 prime number of sum is " +sum);
		
		
	}

	private int find_fact(int no) {
		// TODO Auto-generated method stub
		int fact =1;
		while(no>0)
		{
		fact=fact*no;
		no=no-1;
		}
		System.out.println( "The factorial of given number is " +fact);
	   return fact;
	}

	private void print1_11_111_111() {
		// TODO Auto-generated method stub
		int num=1;
		int num2=1;
		while(num<=5)
		{
			System.out.print(num2 + " ");
			 num2=(num2*10)+1;
			 num=num+1;
		}
		
	}

	private void leastCommonMultiple(int a, int b) {
		int big=a>b? a:b;
		while(true)
		{
			if(big%a==0 && big%b==0)
			{
				System.out.println("The lcm is " +big);
				break;
			}big++;
		}
		// TODO Auto-generated method stub
		
		
	}

	private void print510152048121620() {
		// TODO Auto-generated method stub
		int no=5;
		int no2=5;
		int end=25;
		while(no<=end) {
			System.out.println(no);
			if(no==25)//controlflow/conditional statement
			{
				no=4;
				no2=4;
				end=20;
				continue;
			}
			no=no+no2;
		}
	}

	private void print5101520() {
		// TODO Auto-generated method stub
		int num=5;
		while(num<=25)
		{
			System.out.print( num + " ");
			num=num+5;
		}
		
	}

	private void fibonacciSeries5to80() {
		// TODO Auto-generated method stub
		int no1=5;//5
		int no2=8;//8
		while(no1<=80)
		{
			System.out.print( " " +no1);//8
			no2=no1+no2;//13
			no1=no2-no1;//13-5
			
		}
	}

	private void fibonacci_series_without_using_3variable() {
		// TODO Auto-generated method stub
		int no1=0;//3
		int no2=1;//3
		while(no1<=80)
		{
			System.out.print( " " +no1);//2
			no2=no1+no2;//5
			no1=no2-no1;//5-2
			
		}
		
	}

	private void additionOf20Numbers() {
		// TODO Auto-generated method stub
		int num=1;
		int num2=0;
		while(num<=20)
		{
			 num2=num2+num;
			num=num+1;
		}System.out.println("The addtion of first 20 Numbers "+ num2);
		
	}

	private void firstdoubledigitprimeNumber() {
		// TODO Auto-generated method stub
		LearnLooping2 ll = new LearnLooping2();
		int value=11;
		while(value<=43)
		{
		int num=ll.notprimeNumber(value);
		value=value+1;
		}
	}

	private void first10PrimeNumbers() {
		// TODO Auto-generated method stub
		LearnLooping2 ll = new LearnLooping2();
		int value=1;
		while(value<=25)
		{
		ll.notprimeNumber(value);
		value=value+1;
		}
		
	}

	private void first20PrimeNumberssum() {
		// TODO Auto-generated method stub
		LearnLooping2 ll = new LearnLooping2();
		int value=1;
		int sum2=0;
		int count=0;
		while(value<=70)
		{
		int sum=ll.notprimeNumber(value);
		 sum2=sum2+sum;
		value=value+1;
		}
		System.out.println("The first 20 prime number of sum is " +sum2);
		
	}

	private void fibonacciseriesPrimenumbers() {
		// TODO Auto-generated method stub
		int no1=0;
		int no2=1;
		LearnLooping2 ll = new LearnLooping2();
		while(no1<=30)
		{
			//System.out.print( " " +no1);
			ll.primeNumber(no1);
			int no3=no1+no2;
			no1=no2;
			no2=no3;
		}
		
	}

	private void fibonacciSeries() {
		// TODO Auto-generated method stub
		int no1=0;
		int no2=1;
		while(no1<=30)
		{
			System.out.print( " " +no1);
			int no3=no1+no2;
			no1=no2;
			no2=no3;
			
		}
		
	}

	private void binarytoOctal(int num) {
		// TODO Auto-generated method stub
		String result= " ";
		while(num>0)
		{
		int rem=num%1000;	
		
		 int value=binarytodecimal(rem);
		 result=value+result;
		 num=num/1000;
		}System.out.println("The octal number is " + result);
		
	}

	private int binarytodecimal(int num)
	{
		// TODO Auto-generated method stub
		int sum=0;
		int power=0;
		while(num>0)
		{
		int rem=num%10;
		int result=rem*powerfact( 2, power);
		sum=sum+result;
	
		num=num/10;
		power=power+1;
		}System.out.println("The binary number to decimal number is " +sum);
		return sum;
	}

	private void decimaltobinary(int num) {
		// TODO Auto-generated method stub
		String rem= " ";
		while(num>0)
		{
			int num2= num%2;
			rem=num2+rem;
			System.out.println("The decimal number of gien binary number is " +rem);
			num=num/2;
			
		}
		//System.out.println("The decimal number of gien binary number is " +rem);
	}

	private void print5p44p33p2() {
		// TODO Auto-generated method stub
		int base=5;
		int power =4;
		while(base>=1)
		{
		int result=powerfact( base, power);
		System.out.println("The " +base+" power  of "+power + " is " +result);
		base=base-1;
		power=power-1;
		}
		
		
	}

	private void print1427256() {
		// TODO Auto-generated method stub
		int base=1;
		int power =1;
		while(base<=5)
		{
		int result=powerfact( base, power);
		System.out.println("The power 3 of given"+ base+" is " +result);
		base=base+1;
		power=power+1;
		}
		
	}

	private void print127125() {
		// TODO Auto-generated method stub
		int base=1;
		while(base<=5)
		{
		int result=powerfact( base, 3);
		System.out.println("The power 3 of given"+ base+" is " +result);
		base=base+2;
		}
		
	}

	private void print182764() {
		// TODO Auto-generated method stub
		int base=1;
		while(base<=4)
		{
		int result=powerfact( base, 3);
		System.out.println("The power 3 of given"+ base+" is " +result);
		base=base+1;
		}
		
	}

	private void printing1to100() {
		// TODO Auto-generated method stub
		int num=1;
		while(num<=100)
		{
			//System.out.print(num + " ");
			//System.out.println(" ");
			
			if(num%10==5 || num/10==5)
			{
				System.out.print(  num + " ");
			}num=num+1;
		}
		
	}

	private int factorial(int fact) {
		// TODO Auto-generated method stub
		int result=1;
		int num=1;
		while(fact>=num)
		{
			result=result*num;
	//System.out.println("The factorial of " +num + " is "+result);
			num=num+1;
		}System.out.println("The factorial of  " +fact+ "is "+result);
		return result;
	}

	private void swapingWithout4Variable(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		a=a+b+c+d;
		b=a-(b+c+d);
		c=a-(b+c+d);
		d=a-(b+c+d);
		a=a-(b+c+d);
		System.out.println("The number a is "+ a);
		System.out.println("The number a is "+ b);
		System.out.println("The number a is "+ c);
		System.out.println("The number a is "+ d);
	}

	private void swapingWithout3Variable(int a, int b, int c) {
		// TODO Auto-generated method stub
		a=a+b+c;//5+6+7
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println("The number a is "+ a);
		System.out.println("The number a is "+ b);
		System.out.println("The number a is "+ c);
	}

	private void powerfact54321() {
		// TODO Auto-generated method stub
		int power=1;
		while(power<=5)
		{
		int result=powerfact(2,power);
		System.out.println("The power fact of  2 power " +power + " is "+ result);
		power=power+1;
		}
		
	}

	private int powerfact(int base, int power) {
		// TODO Auto-generated method stub
		int result=1;
		while(power>0)
		{
		result=result*base;
		power=power-1;
		}//System.out.println("The power fact of given number is "+ result);
		return result;
	}

	private void reversePrintingNumber896745(int num) {
		// TODO Auto-generated method stub
		int num2=0;
		while(num>0)
		{
			 int rem=num%100;//89
			 num2=(num2*100)+rem;
			num=num/100;
		}System.out.println("The reverse printing of given number "+ num2);
	}

	private void findDivisorsof100_OnlyPrime(int num) {
		// TODO Auto-generated method stub
		LearnLooping2 ll = new LearnLooping2();
        int div=2;
		
		while(div<=num)
		{
			if(num%div==0)
			{
				//System.out.println("The divisors is " +div);
				ll.primeNumber(div);
			}
			div=div+1;
		}
		
		
	}

	private void reversePrintingNum(int num) {
		// TODO Auto-generated method stub
		int num2=0;
		while(num>0)
		{
			int rem=num%10;//9
			 num2=(num2*10)+rem;//9
			 num=num/10;//45678
		}
		System.out.println("The reverse printing of given number is " +num2);
		
	}

	private int findDivisorsOf100(int num) {
		// TODO Auto-generated method stub
		int div=2;
		
		while(div<num)
		{
			if(num%div==0)
			{
				System.out.println("The divisors is " +div);
				
			}
			div=div+1;
		}return div;
		
	}

}

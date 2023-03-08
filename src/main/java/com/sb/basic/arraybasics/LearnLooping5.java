package com.sb.basic.arraybasics;

public class LearnLooping5 {
    int prime_count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LearnLooping5 ll = new LearnLooping5();
     //ll.find_prime_first20();
    ll.find_prime_first30();
    
	}

	private void find_prime_first30() {
		// TODO Auto-generated method stub
		int no=2;
		while(prime_count<=30) {
			primeNumber(no);
			no=no+1;
		}
		
	}

	private void find_prime_first20() {
		// TODO Auto-generated method stub
		
		LearnLooping2  ll =new LearnLooping2();
		int no=2;
		while(no<=20) {
		ll.primeNumber(no);
		no=no+1;
		}
	}
	
	public int primeNumber(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		int count = 0; 
		while(div<no)
		{
		if(no%div == 0)
		{
		
//System.out.print(div+" "); 
		count = count + 1; 
		break;
		}
		div = div + 1; //2 to 99
		
//System.out.println(count);
		}
		//System.out.println(count);
		if(count==0)
		{
			System.out.println(no + " is Prime ");
			prime_count = prime_count+1;
		}return prime_count;
//		else
//		{
//			//System.out.println("Given Number is Not Prime");
//		} 
}
}

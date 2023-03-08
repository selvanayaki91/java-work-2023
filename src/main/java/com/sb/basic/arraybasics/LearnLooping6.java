package com.sb.basic.arraybasics;
public class LearnLooping6 {

	public static void main(String[] args) {
		LearnLooping6 ll = new LearnLooping6();
		//ll.find_fact(5);
		//ll.find_fact(4);
//		int count=5;
//		while(count>0) {
//			ll.find_fact(count);
//			count=count-1;
//		}
		ll.printnumbers();
		ll.lcm(9,18,22);
		
	}

	private void lcm(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		      int big1=b>c? b:c;
		      int big=big1>a?big1:a;
		      while(true) {
		        if (big%a==0 && big%b==0 && big%c==0) {
		        System.out.println(big);
		        break;
		      }
		        big++;
		      }
		      
		
		
	}

	private void printnumbers() {
		// TODO Auto-generated method stub
//		int no1=1;
//		int no2=10;
//		while(no1<6){
//			System.out.println(no1 + " * " + no2 + " = " +no1*no2);
//			no1=no1+1;
//			no2=no2-1;
//			}
		int no1=10;
		int ans;
		while(no1>0) {
		ans= no1*(11-no1);//10*1
		no1=no1-1;
		System.out.println(ans );
		}
		
	}

	private int find_fact(int no) {
		// TODO Auto-generated method stub
		int fact =1;
		while(no>0) {
		fact =fact*no;
		no=no-1;
		}
		System.out.println("Factorial is " + fact);
		return fact;
	}
	
	

}

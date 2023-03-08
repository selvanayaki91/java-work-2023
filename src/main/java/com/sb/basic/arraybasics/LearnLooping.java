package com.sb.basic.arraybasics;

public class LearnLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnLooping ll= new LearnLooping();
		//ll.dad_daughter();
		//ll.dad_daughter2();
		//ll.tenali_story();
		//ll.dad_daughter4();
		//ll.poosari();
		//ll.milk_expense();
		//ll.milk_expense2();
		//ll.milk_expense3();
		ll.milk_expense4();
		//ll.milk_expense5();
		//ll.milk_expense6();

	}

	private void milk_expense6() {
		// TODO Auto-generated method stub
		int day = 0;
		int milk=25;
		int expense=0;
		while(day<27)
		{
			expense=expense+milk;
			day=day+9;
			System.out.println("The buying milk day is " + day);
		}
		
		System.out.println("The monthly expense is  "+ expense);
		
		
		
	}

	private void milk_expense5() {
		// TODO Auto-generated method stub
		
		int day = 0;
		int milk=20;
		int expense=0;
		while(day<27)
		{
			expense=expense+milk;
			day=day+3;
			System.out.println("The buying milk day is " + day);
		}
		
		System.out.println("The monthly expense is  "+ expense);
		
	}

	private void milk_expense4() {
		// TODO Auto-generated method stub
		int day=1;
		int expense=0;
		int milk=20;
		while(day<=28)
		{
			expense= expense+milk;
			System.out.println("The buying milk day is "+ day);
			day = day+4;
			
		}
		System.out.println("The monthly expense is " + expense);
		
	}

	private void milk_expense3() {
		// TODO Auto-generated method stub
		int expense=0;
		int day =1;
		int milk=20;
		while(day<=28)
		{
			expense = expense+milk;
			//day = day+1;
			System.out.println("Milk given on " + day);
			day = day+2;
			//System.out.println("Milk given on " + day);
		}
		System.out.println("The monthly milk expense is " +expense);
		
		
	}

	private void milk_expense2() {
		// TODO Auto-generated method stub
		int expense=0;
		int day =1;
		int milk=20;
		while(day<=28)
		{
			expense = expense+milk;
			//day = day+1;
			day = day+2;
		}
		System.out.println("The monthly milk expense is " +expense);
		
	}

	private void milk_expense() {
		// TODO Auto-generated method stub
		int expense=0;
		int day =1;
		int milk=20;
		while(day<=28)
		{
			expense = expense+milk;
			day = day+1;
		}
		System.out.println("The monthly milk expense is " +expense);
		
	}

	private void poosari() {
		// TODO Auto-generated method stub
		int temple = 7; 
		int flower = 1;
		while(temple>0)
		{
		flower = flower * 2; 
		temple = temple - 1; 
		}
		System.out.println("Initially "+ flower); 
		
	}

	private void tenali_story() {
		// TODO Auto-generated method stub
		int beat = 1024; 
		int security_count=0;
		while(beat>1)
		{
		System.out.println("Security gets " + (beat/2)); 
		security_count = security_count +1;
		beat = beat / 2; 
		}
		System.out.println("No.of securities " + security_count);
		System.out.println("One for Me"); 

		}
	

	private void dad_daughter4() {
		// TODO Auto-generated method stub
		int beat = 1024; 
		while(beat>1)
		{
		System.out.println("Security gets " + (beat/2)); 
		beat = beat / 2; 
		}
		System.out.println("One for Me"); 

		
	}

	
	private void dad_daughter2() {
		// TODO Auto-generated method stub
		int purse = 0; 
		int day = 1; 
		while(day<=10)
		{
		purse = purse + 5; 
		day = day + 1; 
		}
		System.out.println(purse); 
	}

	private void dad_daughter() {
		// TODO Auto-generated method stub
		int purse = 0; 
		int day = 1; 
		while(day<=10)
		{
		purse = purse + day; 
		day = day + 1; 
		}
		System.out.println(purse); 
		
	}

}

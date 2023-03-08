package com.sb.basic.pattern;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Pattern2 patternObj = new Pattern2();
     //patternObj.pattern1();
     //patternObj.pattern1_1();
      //patternObj.pattern2();
      //patternObj.pattern3();
      //patternObj.pattern4();
      //patternObj.pattern5();
      //patternObj.pattern6();
      //patternObj.pattern7();
      //patternObj.pattern8();
      //patternObj.pattern9();
      //patternObj.pattern10();
      //patternObj.pattern11();
      //patternObj.pattern12();
     // patternObj.pattern13();
      //patternObj.pattern14();
      //patternObj.pattern15();
      //patternObj.pattern16();
      patternObj.pattern16_1();
      //patternObj.pattern17();
      
	}

	private void pattern16_1() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		    
		    for(int col=1; col<=5; col++)
		    {
		    	if(col>=row)
		    	{
		       System.out.print("H"+" "); 
		    }
		    	else
		    		System.out.print("  ");
		    }
		System.out.println(); 
		} 
		
	}

	private void pattern17() {
		// TODO Auto-generated method stub
		int k=1;
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<row+1;col++)
			{
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	private void pattern16() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		    for(int star=1; star<row; star++)
		    {
		    System.out.print("* "); 
		    }
		    for(int col=5; col>=row; col--)
		    {
		       System.out.print("H"+" "); 
		    }
		System.out.println(); 
		} 
	}

	private void pattern15() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}

	private void pattern14() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
	}

	private void pattern13() {
		// TODO Auto-generated method stub
		for(int row = 1; row<=5;row++)
		{
		    for(int col=row; col<=row; col++)
		    {
		    System.out.print(col+row + " "); 
		    }
		System.out.println(); 

		}
		
	}

	private void pattern12() {
		// TODO Auto-generated method stub
		for(int row = 1; row<=5;row++)
		{
		    for(int col=0; col<=row-1; col++)
		    {
		    System.out.print(col+row + " "); 
		    }
		System.out.println(); 

		}
	}

	private void pattern11() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*"+ " ");
				
			}System.out.println();
		}
	}

	private void pattern10() {
		// TODO Auto-generated method stub
		for(int row = 1; row <=5; row++)
		{
			for(int col= 0; col<=5-row; col++)
			{
				System.out.print(col+row+" "); 
			}
		System.out.println(); 
		}
	}

	private void pattern9() {
		// TODO Auto-generated method stub
		for(char ch1='A';ch1<='E';ch1++)
		{
		for(char ch='A'; ch<=ch1;ch++)
		{
			System.out.print(ch + " ");
		}
		System.out.println();
		}
	}

	private void pattern8() {
		// TODO Auto-generated method stub
		for(char ch1='E';ch1>='A';ch1--)
		{
		for(char ch='A'; ch<=ch1;ch++)
		{
			System.out.print(ch + " ");
		}
		System.out.println();
		}
		
	}

	private void pattern7() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
		for(int col=5;col>=row;col--)
				{
					System.out.print(row+ " ");
				}
		System.out.println();
		}
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		for(int col=5;col>=6-row;col--)
				{
					System.out.print(col+ " ");
				}
		System.out.println();
		}

		
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		for(int col=5;col>=row;col--)
				{
					System.out.print(col+ " ");
				}
		System.out.println();
		}

		
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row = 5; row >=1; row--)
		{
			for(int col= 5; col>=row; col--)
			{
				System.out.print(col+" "); 
			}
		System.out.println(); 
		}
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int row=1 ;row<=5  ;row++)
		{
			for(int col=5 ;col>=row  ;col--)
			{
				System.out.print(col + " ");
			}
			System.out.println( );
		}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row = 1; row<=5;row++)
		{
		    for(int col=1; col<=row; col++)
		    {
		    System.out.print(col + " "); 
		    }
		System.out.println(); 

		}
		
		
	}

	private void pattern1_1() {
		// TODO Auto-generated method stub
		for(int row = 1; row <=5; row++)
		{
			for(int col= 1; col<=6-row; col++)
			{
				System.out.print(row+" "); 
			}
		System.out.println(); 
		}
		
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+ " ");
				
			}System.out.println();
		}
		
	}

}

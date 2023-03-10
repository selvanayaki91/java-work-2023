package com.sb.basic.arraybasics;

public class ArrayBasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayBasics2 arr= new ArrayBasics2();
       //arr.finding_of_givenNum();
       //arr.finding_bigNum();
       //arr.finding_smallNum();
     // arr.first_two_big_Number();
      // arr.first_two_small_Number();
      // arr.total_of_odd_values();
       //arr.total_of_odd_indexed_values();
       //arr.concatenation_of_two_arrays();
      //arr.finding_only_negative_num();
    // arr.copy_only_negativeNum();
   // arr.copy_odd_indexNum();
     // arr.sivaprogramme();
       //arr.moving_toleft();
       //arr.moving_all_right//();
     //  arr.copyinggivenarrayInReverseinsamearray();
      // arr.sumOf2Elementsincorrespondingarray10();
      //arr.first_2_big_number();
      //arr.wrapper_class_methods();
       //arr.odd_numbersGivenArray();
       //arr.even_numbersgivenArray();
      //int result= arr.primeNumber(13);
      //arr.printPrimeNumIngivenArray();
      //arr.printallnumberisPrimeNumGivenArray();
      
     // int result= arr.perfectNum(6);
      //System.out.println(result);
       arr.givenarrayElementisAnyElementPerfectNumbers();
       //arr.evenElementinOddIndex();
       //arr.oddElementinEvenIndex();
       
	}

	private void oddElementinEvenIndex() {
		// TODO Auto-generated method stub
		int[] ar = {17,11,20,12,1,};
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0 &&ar[i]%2!=0)
			{
				System.out.println(ar[i]);
			}
		}
		
	}

	private void evenElementinOddIndex() {
		// TODO Auto-generated method stub
		int[] ar = {17,11,20,12,1,};
		for(int i=0;i<ar.length;i++)
		{
			if(i%2!=0 &&ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
		
	}

	private void givenarrayElementisAnyElementPerfectNumbers() {
		// TODO Auto-generated method stub
		int[] ar = {3,6,7,8,9,28,8128};
		
		int count=0;
		
		int i;
		for( i=0;i<ar.length;i++)
		{
			//int result=perfectNum(ar[i]);
			if(perfectNum(ar[i])!=0)
			{
				count++;
			}
			
		}if(count==ar.length)
		{
			System.out.println("The given array elements are all number perfect numbers");
		}else
		{
			System.out.println("no");
		}
	}

	private int perfectNum(int num) {
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
			//System.out.println(num+" is perfect  number");
			return num;
			}
		return 0;
//		else {
				//System.out.println(num+" is not perfect number ");
			}
	

	private void printallnumberisPrimeNumGivenArray() {
		// TODO Auto-generated method stub
       int[] ar= {1,2,3,4,6,8,9,30,5,45};
		int len= ar.length;
		System.out.println(len);
		int count1=0;
		
		for(int i=0;i<ar.length;i++)
		{
			primeNumber(ar[i]);
			count1=count1+1;
		}
		System.out.println(count1 + "is given array");
		if(count1==len)
		{
			System.out.println("The given array element all is prime number");
		}else
			System.out.println("The given array element is not all prime Number ");
	}

	private void printPrimeNumIngivenArray() {
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,4,6,8,9,30,5,45};
		int i;
		for( i=0;i<ar.length;i++)
		{
		int result=primeNumber(ar[i]);
		
		}
	}

	private int primeNumber(int no) {
		// TODO Auto-generated method stub
		int div=2;
		int count=0;
		while(div<no)
		{
			if(no%div==0)
			{
				count++;
			}div++;
		}if(count==0)
		{
			System.out.println(no + "is prime number");
			
			
		}return no;
	}

	private void even_numbersgivenArray() {
		// TODO Auto-generated method stub
		int[] ar= {5,6,7,8,9,10,12,15,17,20};
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				count++;
			}
		}
		int[] even_count=new int[count];
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				even_count[j]=ar[i];
				System.out.println(even_count[j]);
				j++;
			}
		}
	}

	private void odd_numbersGivenArray() {
		// TODO Auto-generated method stub
		int[] ar= {5,6,7,8,9,10};
		          //0 1 2 3 4 5
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			{
				count++;
			}
		}int[] odd_arr=new int[count];
		  int j=0;
		  int[] ar1 = {5,6,7,8,9,10};
		  for(int i=0;i<ar.length;i++)
		  {
			  if(ar[i]%2!=0)
			  {
				  odd_arr[j]=ar1[i];
				  System.out.println(odd_arr[j]);
				  j++;
			  }
		  }
		
	}

	private void wrapper_class_methods() {
		// TODO Auto-generated method stub
		int no=5;
		Integer i = no;
		Float f= i.floatValue();
		System.out.println(f);
		int max= Integer.MAX_VALUE;//static final value
		int min=Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		int com=Integer.compare(max, min);
	}

	private void first_2_big_number() {
		// TODO Auto-generated method stub
		int[] ar = {87,89,90,88,92};
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE; 
		for(int i=1; i<ar.length; i++)
		{
		if(ar[i]>first)//89>87,90>89==
		    {
		    second = first; //87
		    first = ar[i];//89
		    }
		else if(ar[i]>second)//
		    {
		    second = ar[i]; //
		    }
		}
		System.out.println(first); 
		System.out.println(second); 
		
	}

	private void sumOf2Elementsincorrespondingarray10() {
		// TODO Auto-generated method stub
		int[] ar = {0,10,1,8, 2,8,5, 9,5};
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i]+ar[j]==10) {
					System.out.println(ar[i]);
					System.out.println(ar[j]);
				}
			}
		}
	}

	private void copyinggivenarrayInReverseinsamearray() {
		// TODO Auto-generated method stub
		
		int[] ar = {5,10,15,20}; 
		int i =0; 
		int len = ar.length; 
		int half = ar.length/2;

		while(i<half)
		{
		int temp = ar[i]; 
		ar[i] = ar[len-(i+1)]; 
		ar[len-(i+1)] = temp; 
		i++;
		} 
		for(i=0;i<ar.length;i++)
		{
			System.out.println(ar[i] + " ");
		}
	}

	private void moving_all_right() {
		// TODO Auto-generated method stub
		int[] ar = {8, 4, 7, 3}; 
		int len = ar.length; 
		int temp = ar[len-1]; 
		for(int i =0; i<ar.length-1; i++)
		ar[len-1] = ar[len-2]; 
		ar[len-2] = ar[len-3]; 
		ar[len-3] = ar[len-4]; 

		ar[len-4] = temp; 
		
	}

	private void moving_toleft() {
		// TODO Auto-generated method stub
		int[] ar = {8, 4, 7, 3}; 
		int temp = ar[0]; int i ;
		for(i =0; i<ar.length-1; i++)
		{
		ar[i] = ar[i+1]; 
		System.out.print(ar[i]+ "  "); 
		}
		ar[i] = temp; 
		System.out.println(ar[i]);
	}

	private void sivaprogramme() {
		// TODO Auto-generated method stub
		
		     int[]  ar= {1,-1,2,3,-5,-6,-7,8};
		     int count=0;
		     int j=0;
		    for (int i = 0; i < ar.length; i++) {
		      if (ar[i]<0) {
		        count++;
		      }
		    }
		    int[] ar1=new int[count];
		    for (int i = 0; i < ar.length; i++) {
		      if (ar[i]<0) {
		        ar1[j]=ar[i];
		        j++;
		      }
		    }
		    for (int i = 0; i < ar1.length; i++) {
		      System.out.print(ar1[i]+" ");
		    }
		}
	
	

	private void copy_odd_indexNum() {
		// TODO Auto-generated method stub
		int[]  ar= {1,-1,2,3,-5,-6,-7,8};
		int count=0;
		int[] copy=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		  {
			if(i%2!=0)

		   {
				System.out.print(ar[i] + "  ");
				copy[i] =ar[i];
				count++;
				}
		  }
		        System.out.println();
		  for(int i=0;i<copy.length;i++)
		  {
			  if(copy[i]!=0)
			  System.out.print(copy[i] + "  ");
		  }
		
	}

	private void copy_only_negativeNum() {
		// TODO Auto-generated method stub
		
		int[]  ar= {1,-1,2,3,-5,-6,-7,8};
		int count=0;
		
		
		int i;
		for (i=0;i<ar.length;i++)
		  {
			if(ar[i]<0)
			{
				 System.out.print(ar[i]+"  ");
				 count++;
				//copy[i]=ar[i];
			}
		  }
		System.out.println();
		  System.out.println(count);
		  int[] copy=new int[count];
		  int j=0;
		  for (i=0;i<ar.length;i++)
		  {
			if(ar[i]<0)
			{
				// System.out.print(ar[i]+"  ");
				 //count++;
				copy[j]=ar[i];
				System.out.print(copy[j]+ " ");
				j++;
				
			}
		  }
	}

	private void finding_only_negative_num() {
		// TODO Auto-generated method stub
		int[]  ar= {1,-1,2,3,-5,-6,-7,8};
		for(int i=0;i<ar.length;i++)
		  {
			if(ar[i]<0)

		   {
				System.out.println(ar[i]);
				}
		
		  }
		
	}

	private void finding_of_givenNum() {
		// TODO Auto-generated method stub
		int[] ar = {5,10,6,13,25};
		int no=13;
		for(int i=1;i<ar.length;i++)
		{
		if(no==ar[i])
		{
			System.out.println("yes present at " +i);
		}
		}
	}

	private void concatenation_of_two_arrays() {
		// TODO Auto-generated method stub
		int[] class1 = {90, 89, 75, 35};

		int[] class2 = {78, 36, 54}; 

		int[] result = new int[class1.length + class2.length]; 
		int j=0; 
		for(int i=0; i<result.length; i++)
		{
		if(i<class1.length)
		{
		result[i] = class1[i]; 
		System.out.println(result[i]); 
		}
		else
		{
		result[i] = class2[j]; 
		System.out.println(result[i]); 
		j++;
		}
		} 
	}

	private void total_of_odd_indexed_values() {
		// TODO Auto-generated method stub
		int[] ar = {5, 7, 6, 8, 3, 1, 8, 2}; 
                //  0, 1, 2, 3, 4, 5, 6, 7
int total = 0;   
for(int i=0; i<ar.length; i++)
{
if(i%2!=0)
    {
    total = total + ar[i]; 
    }
}
System.out.println(total); 
	}

	private void total_of_odd_values() {
		// TODO Auto-generated method stub
		int[] ar = {5, 7, 6, 8, 3, 1, 8, 2}; 
		int total = 0;   
		for(int i=0; i<ar.length; i++)
		{
		if(ar[i]%2!=0)
		    {
		    total = total + ar[i]; 
		    }
		}
		System.out.println(total);
	}

	private void first_two_small_Number() {
		// TODO Auto-generated method stub
		int[] ar = {87,89,90,88,92};
		int first = ar[0], second = ar[1]; 
		for(int i=2; i<ar.length; i++)
		{
		if(ar[i]<first)//89<87
		    {
		    second = first; 
		    first = ar[i];
		    }
		else if(ar[i]<second)
		    {
		    second = ar[i]; 
		    }
		}
		System.out.println("The first smallest Number is "+first); 
		System.out.println("The second smallest Number is "+second); 
		
		
	}

	private void first_two_big_Number() {
		// TODO Auto-generated method stub
		int[] ar = {87,89,90,88,92};
		int first = ar[0], second = ar[0]; 
		for(int i=1; i<ar.length; i++)
		{
		if(ar[i]>first)//89>87,90>89
		    {
		    second = first; //87
		    first = ar[i];//89
		    }
		else if(ar[i]>second)//
		    {
		    second = ar[i]; //
		    }
		}
		System.out.println(first); 
		System.out.println(second); 
		
	}

	private void finding_smallNum() {
		// TODO Auto-generated method stub
		int[] ar = {87, 89, 90, 80,100}; 

		int small = ar[0];
		for(int i=1; i<ar.length; i++)
		{
		if(ar[i]<small)
		    {
		    small = ar[i]; 
		    }
	}
		System.out.println("The small Number is" +small);
	}
	

	private void finding_bigNum() {
		// TODO Auto-generated method stub
		int[] ar = {87, 89, 90, 80,100}; 

		int big = ar[0];
		for(int i=1; i<ar.length; i++)
		{
		if(ar[i]>big)
		    {
		    big = ar[i]; 
		    }
	}
		System.out.println("The biggest Number is" +big);
	}
}



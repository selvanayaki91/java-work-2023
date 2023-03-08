package com.sb.basic.pattern;

public class Learn_looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       System.out.println(1+2+3+4+5+"6");
//       System.out.println(1+5+"6");
//       System.out.println("1"+3+4+5+6+7);
		
//		int no=1;
//		while(no<=5)//entry criteria looping
//		{
//			System.out.println(no);
//			no++;
//		}
		
//		int no=10;
//		do
//		{
//			System.out.println(no);
//			no++;//11
//		}while(no<=5);//exit crieteria looping
//		System.out.println(no);
//   	int no=10;
//		for(;no<=5;no++)
//		{
//			System.out.println(no);
//		}
//		System.out.println(no);
		
		
//     	int no=1;
//    	for(;no<=5;)
//	    {
//			System.out.println(no);
//			no++;
//		}
//		System.out.println(no);
		
//		int no=1;
//    	for(;true;)
//	    {
//    		if(no==5)
//    		{
//    			break;
//    		}
//			System.out.println(no);
//			no++;
//		}
//		System.out.println(no);
		
//		int no=1;
//     	for(;;)
//	    {
//    		if(no==5)
//    		{
//    			break;
//   		     }
//			System.out.println(no);
//			no++;
//	     }
	 	//System.out.println(no);
		
//		int no=1;
//    	for(;;)
//	    {
//    		if(no==5)
//    		{
//    			System.out.println(no);
//    			break;
//    		}
//			
//			no++;
//		}
     	
     	Learn_looping ll = new Learn_looping();
		//ll.pattern1();
		//ll.pattern2();
		//ll.pattern3();
     	//ll.pattern4();
     	//ll.pattern5();
     	//ll.pattern6();
     	//ll.pattern7();
     	//ll.pattern8();
     	//ll.pattern9();
     	//ll.pattern10();
     	//ll.pattern11();
     	//ll.basic();
     	//ll.pattern12();
     	//ll.pattern13();
     	//ll.pattern14();
     	//ll.pattern15();
     	//ll.pattern16();
     	//ll.pattern17();
     	
     	
     	
		
}

	private void pattern17() {
		// TODO Auto-generated method stub
		for(int count=1;count<=5;count++)
		{
			for(char ch='A';ch<='Z';ch++)
			{
				System.out.print(ch + " ");
				if(ch=='E')
				{
					
					System.out.println();
					continue;
				}
			}
			System.out.println();
		}
		
	}

	private void pattern16() {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='Z'; ch=(char)(ch+5))
		{
			for(char ch1=ch;ch1<ch+5;ch1++)
			{
				System.out.print(ch1+ " ");
			}System.out.println();
		}
	}

	private void pattern15() {
		// TODO Auto-generated method stub
		
		for(char ch='A'; ch<='z';ch++)
		{
			System.out.print(ch + " ");
		
			if(ch=='E')
			{
		    System.out.println();
		    continue;
			}
			if(ch=='J')
			{
		    System.out.println();
		    continue;
			}
		}
		
		
	}

	private void pattern14() {
		// TODO Auto-generated method stub
		for(int count=1;count<=3;count++)
		{
		for(char ch='A'; ch<='E';ch++)
		{
			System.out.print((char)(ch*count)+ " ");
		}
		System.out.println();
		}
		
	}

	private void pattern13() {
		// TODO Auto-generated method stub
		for(int count=1;count<=3;count++)
		{
		for(char ch='A'; ch<='E';ch++)
		{
			System.out.print(ch + " ");
		}
		System.out.println();
		}
		
	}

	private void pattern12() {
		// TODO Auto-generated method stub
		int count=1;
		for(char ch='A'; ch<='E';ch++)
		{
			System.out.print(ch + " ");
			if(ch=='E')
			{
				count=count+1;
				if(count==6)
					break;
				ch='A'-1;
				System.out.println();
				continue;
//				if(count==6)
//					break;
			}
		}
		
	}

	private void basic() {
		// TODO Auto-generated method stub
		for(int no=1;no<=15;no++)
		{
			System.out.print(no + " ");
			if(no%5==0)
			{
				System.out.println();
			}
		}
		
	}

	private void pattern11() {
		// TODO Auto-generated method stub
        int no=1;int end=5;
        while(end<=15)
		{
		while(no<=end)
		{
			System.out.print(no + " ");
			no++;
		}
		System.out.println();
		end=end+5;
		}
		
	}

	private void pattern10() {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++)
		{
		for(int col=1;col<=5;col++)
		{
			System.out.print(col + " ");
		}
		System.out.println();
		}
	}

	private void pattern9() {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++)
		{
		for(int col=3;col<=15;col+=3)
		{
			System.out.print((col*row) + " ");
		}System.out.println();
		}
		
	}

	private void pattern8() {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++)
		{
		for(int col=9;col>=1;col-=2)
		{
			System.out.print(col + " ");
		}
		System.out.println();
		}
		
		
	}

	private void pattern7() {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++)
		{
		for(int col=1;col<=9;col+=2)
		{
			System.out.print(col + " ");
		}
		System.out.println();
		}
		
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		
		for(int col=5;col>=1;col--)
		{
			System.out.print(col + " ");
		}
		System.out.println();
		}
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		
		for(int col=1;col<=5;col++)
		{
			System.out.print(col + " ");
		}
		System.out.println();
		}
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int row=3;row>=1;row--)
		{
		for(int col=1;col<=5;col++)
		{
			System.out.print(row + " ");
		}
		System.out.println();
		}
		
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int no=1;no<=3;no++)
		{
		for(int col=1; col<=5;col++)
		{
			System.out.print(no + " ");
		}
		System.out.println();
		}
	}

	private void pattern1() {
		int no=1;
		while(no<=3)
		{
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++)
		{
			System.out.print(no + " ");
		}System.out.println();no++;
		}
	}
}

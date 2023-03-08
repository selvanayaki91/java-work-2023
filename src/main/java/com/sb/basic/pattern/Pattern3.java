package com.sb.basic.pattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Pattern3 patObj = new Pattern3();
     //patObj.print_c();
     patObj.print1();
     // patObj.print_x();
     //patObj.print_S();
     //patObj.print_E();
     //patObj.print_L();
     //patObj.print_T();
     //patObj.print_I();
     //patObj.print_N();
    // patObj.print_K();
     //patObj.print_R();
    // patObj.print_X2();
    // patObj.print_v();
     //patObj.print_Y();
     //patObj.print_A();
     
     
	}

	private void print_A() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=9;col++)
			{if(row!=3)
			{
				if(col<=5)
				{
					if(col+row==6)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else
				{
					if(col-row==4)
						System.out.print("* ");
						else
							System.out.print("  ");
				}
			}else
			{
				if(col>=3 && col<=7)
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			
			}System.out.println();
		}
		
	}

	private void print_Y() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row<=5)
				{
				if( row==col ||row+col==10)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
				else
			{
				if(row+col==10)
				
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			}
			System.out.println();
		}
			
	}

	private void print_v() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if( row==col ||row+col==10)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void print_X2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if( row==col ||row+col==10)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void print_R() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=6;col++)
			{
				if(row<=5)
				if( row==1 ||col==1 || col+row==7)
				{
					System.out.print("* ");
				}else
					System.out.print("  ");
				if(row>5)
				 if(col==1 || row-col==3)
				{
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}System.out.println();
		}
		
	}

	private void print_K() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=6;col++)
			{
				if(row<=5)
				if( col==1 || col+row==7)
				{
					System.out.print("* ");
				}else
					System.out.print("  ");
				if(row>5)
				 if(col==1 || row-col==3)
				{
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}System.out.println();
		}
			
	}

	private void print_L() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==9 || col==1)
				{
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}System.out.println();
		}
		
		
	}

	private void print_N() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(col==1 || col==row ||col==9)
				{
					System.out.print("! ");
				}
				else
				System.out.print("  ");
			}System.out.println();
		}
	}

	private void print_E() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==1 || row==5 || row==9||col==1)
				{
					System.out.print("! ");
				}
				
				else
				System.out.print("* ");
			}System.out.println();
		}
	}

	private void print_S() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==1 || row==5 || row==9)
				{
					if(col==1 || col==9)
					{
						System.out.print("  ");
					}else
					System.out.print("* ");
				}
				else if(col==1 &&row<5)
				{
					System.out.print("! ");
				} 
				else if(col==9 &&row>5)
				{
					for(int space=1;space<=8;space++)
					{
						System.out.print("  ");
					}
					System.out.print("! ");
				}
//				else
//				System.out.print("* ");
			}System.out.println();
		}
	}

	private void print_I() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==1 || col==5 || row==9)
				{
					System.out.print("# ");
				}
				else
				System.out.print("* ");
			}System.out.println();
		}
	}

	private void print_T() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==1 || col==5)
				{
					System.out.print("# ");
				}
				else
				System.out.print("* ");
			}System.out.println();
		}
		
	}

	private void print_x() {
		// TODO Auto-generated method stub
		for(int row=1;row<=8;row++)
		{
			for(int col=1;col<=8;col++)
			{
				if(col==row || col==9-row)
				{
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}System.out.println();
		}
		
	}

	private void print1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				System.out.print("! ");
			}System.out.println();
		}
		
	}

	private void print_c() {
		// TODO Auto-generated method stub
		for(int star=1;star<=7;star++)
		{
			System.out.print("* ");
		}System.out.println();
		for(int star=1;star<=7;star++)
		{
			System.out.println("* ");}
		for(int star=1;star<=7;star++)
		{
			System.out.print("* ");}
		
	}

}

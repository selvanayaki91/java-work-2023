package com.sb.basic.arraybasics;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SpiralMatrix sp = new SpiralMatrix();
     // sp.print_4_4();
      
       //sp.spiralpattern();
      int[][] a=sp.matrixMultiplication();
//      for(int[] row:val)
//      {
//    	  for(int col:row)
//    	  {
//    		  System.out.print(col+" ");
//    	  }
//    	  System.out.println();
//      }
      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
              System.out.print( a[i][j]+" ");
          }
          System.out.println();
      }
      
	}

	

	private int[][] matrixMultiplication() {
		// TODO Auto-generated method stub
		int[][] a = { {1,2,3}, {3,4,2}, {3,2,1}};
		int[][] b = { {1,1,1}, {3,4,2}, {3,2,1}};
		int[][] result= new int[3][3];
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<b[row].length;col++)
			{
				result[row][col]=0;	
			    for(int k=0;k<3;k++)
			    {
			    	result[row][col]+=a[row][k]*b[k][col];//16
			    	
			    }//System.out.print(result[row][col]+" ");
				}//System.out.println();
		}return result;
		
	}



	private void spiralpattern() {
		// TODO Auto-generated method stub
		int minRow=0;
		int maxRow=2;
		int minCol=0;
		int maxCol=2;
		int[][] ar= new int[3][3];
		int val=1;
        while(minRow<=maxRow && minCol<=maxCol)
        {
        	for(int col=minCol;col<=maxCol;col++)
        	{
        		ar[minRow][col]=val;//123
        		val++;
        	}
        	for(int row=minRow+1;row<=maxRow;row++)
        	{
        		ar[row][maxCol]=val;
        		val++;
        	}
        	
        	if(minRow<maxRow && minCol<maxCol)
        	{
        		for(int col=maxCol-1;col>minCol;col--)
        		{
        			ar[maxRow][col]=val;
        			val++;
        		}
        		for(int row=maxRow;row>minRow;row--)
        		{
        			ar[row][minCol]=val;
        			val++;
        		}
        	}
        	minRow++;//1
    		maxCol--;//2
    		minCol++;
    		maxRow--;
        }for (int i = 0; i < ar.length; i++) {
	        for (int j = 0; j < ar[i].length; j++) {
	            System.out.print(ar[i][j]+" ");
	        }System.out.println();
	}
	}

	private void print_4_4() {
		// TODO Auto-generated method stub
		int minRow=0;
		int maxRow=3;
		int minCol=0;
		int maxCol=3;
		int[][] ar= new int[4][4];
		int no=1;
		while(minRow<=maxRow && minCol<=maxCol) {
		for(int col=minCol;col<=maxCol;col++)
		{
			ar[minRow][col]=no;
			
			//System.out.print(ar[minRow][col]+" ");
			no++;
		}//System.out.println();
		
		for(int row=minRow+1;row<=maxRow;row++)
		{
			ar[row][maxCol]=no;
			
			//System.out.print(ar[row][maxCol]+" ");
			no++;
		}//System.out.println();
		if(minRow<maxRow && minCol<maxCol) {
		for(int col=maxCol-1;col>minCol;col--)
		{
			ar[maxRow][col]=no;
			
			//System.out.print(ar[maxRow][col]+" ");
			no++;
		}//System.out.println();
		for(int row=maxRow;row>minRow;row--)
		{
			ar[row][minCol]=no;
			
			//System.out.print(ar[row][minCol]+" ");
			no++;
		}//System.out.println();
		}
		minRow++;//1
		maxCol--;//2
		minCol++;
		maxRow--;
	}
		for (int i = 0; i < ar.length; i++) {
	        for (int j = 0; j < ar[i].length; j++) {
	            System.out.print(ar[i][j]+" ");
	        }System.out.println();
	}
	}
}



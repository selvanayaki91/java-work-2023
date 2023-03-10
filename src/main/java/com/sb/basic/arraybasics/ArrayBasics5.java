package com.sb.basic.arraybasics;

public class ArrayBasics5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayBasics5 ar = new ArrayBasics5();
        ar.matrixAddition();
	}

	private void matrixAddition() {
		// TODO Auto-generated method stub
		int[][] a = {	{1,2},
				{3,4}
			  }; 
	int[][] b = {	{2, 3},
				{4, 5}	
			};
	int[][] result = new int[2][2]; 
	for(int r=0; r<a.length; r++){
	int c =0; 
	while(c<a[r].length)
	{
	result[r][c] = a[r][c] + b[r][c];
	System.out.print(result[r][c]+" "); 
	c++; 
	} System.out.println(); 
	
	} 
	}

}

package com.sb.basic.arraybasics;

public class ArrayBasics4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayBasics4 ar = new ArrayBasics4();
         int[] arr= {10,8,5,4};
       arr= ar.sortingArray(arr);
//       for(int i=0;i<arr.length;i++)
//       {
//    	   System.out.println(arr[i]+ " ");
//       }
       ar.search(arr,15);
	}

	private void search(int[] arr, int key) {
		// TODO Auto-generated method stub
		int min =0, max = arr.length-1; 
		while(min<=max)
		{
		int mid = (min+max)/2; 
		if(key==arr[mid])
		{
		System.out.println("Present at "+ mid); 
			break; 
			}
		else if(key>arr[mid]){
			min = mid+1;}
		else{
			max = mid-1; 
			}
		}
		if(min>max)
		{
			System.out.println("Element is not present");
		}
	}

	private int[] sortingArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int j=1; j<arr.length;j++)
		{
		for(int i=0; i<arr.length-j; i++)
		{
		if(arr[i]>arr[i+1])	
		{
		int temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = temp; 
		}
		}
		}
		
		return arr; 
		
	}

}

package com.sb.basic.arraybasics;

public class LuhnAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LuhnAlgorithm laObj = new LuhnAlgorithm();
       laObj.Givennumber_is_valid_ornotvalid();
	}

	private void Givennumber_is_valid_ornotvalid() {
		// TODO Auto-generated method stub
		
		int[] cn= {7,9,9,2,7,3,9,8,7,1,3};
		
		
		for(int i=cn.length-2;i>=0;i=i-2)
		{
			int temp=cn[i];
			temp=temp*2;
			if(temp>9)
			{
				temp=temp%10+1;
			}
			cn[i]=temp;
			
		}
		 int total=0;
		for(int i=0;i<cn.length;i++)
		{
			total=total+cn[i];
		}
		total=total%10;
		//System.out.print(total+ " ");
		if(total==0)
		{
			System.out.println("This is a valid credit card");
		}else
		{
			System.out.println("This is a invalid credit card");
		}
	}

}

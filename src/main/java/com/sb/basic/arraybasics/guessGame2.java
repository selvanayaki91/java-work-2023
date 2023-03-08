package com.sb.basic.arraybasics;
import java.util.Scanner;

public class guessGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myobj = new Scanner(System.in);
		 int g[]={1,2};
		 int u[]=new int[g.length];
		 char c[]=new char[g.length];
		 for(int a=0;a<u.length;a++)
		 {
		 u[a]=myobj.nextInt();
		 }
		 for(int e=0;e<u.length;e++){
		 for(int b=0;b<g.length+1;b++){
		  if(u[e]==g[b] && e==b)
		  {
		   c[e]='c';
		 }

		 else if(u[e]==g[b] && e!=b)
		 {
		 c[e]='p';
		 }
		 else if(b==g.length){
		 c[e]='x';
		 }

		 else if(u[e]!=g[b]){
		 continue;
		 }

		 else 
		 c[e]='x';

		 } 
		 }
		 for(int a=0;a<u.length;a++){
		 System.out.print(c[a]);
		 }
		 }
		 }
	



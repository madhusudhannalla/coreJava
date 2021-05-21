package com.ojas.strings;

import java.util.Scanner;

public class TwoDColSum {
	private static int[] sumOfCols(int[][] arr) {
          int sum[]=new int[arr.length];
		/*for(int i=0;i<arr[i].length;i++) {
			int add=0;
			for(int j=0;j<arr.length;j++) {*/
          for(int j=0;j<arr[j].length;j++) {
  			int add=0;
  			for(int i=0;i<arr.length;i++) {
		            add+=arr[i][j];
		           
			}
			 sum[j]=add; 
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows=sc.nextInt();
		System.out.println("enter no of cols");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter "+(i+1)+"st row values");
			for(int j=0;j<arr[i].length;j++) {
				 arr[i][j]=sc.nextInt();
			}
		}
		int result[]=sumOfCols(arr);
		for(int a:result) {
			System.out.println(a);
		}
		
}

	
}



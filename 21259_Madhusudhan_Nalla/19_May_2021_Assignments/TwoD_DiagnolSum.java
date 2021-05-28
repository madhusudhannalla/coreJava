package com.ojas.strings;

import java.util.Scanner;

public class TwoD_DiagnolSum {
	private static int[] sumOfCols(int[][] arr,int rows,int cols) {
          int sum[]=new int[cols];
          int  i=0;
          
		for(i=0;i<rows;i++) {
			int add=0;
			for(int j=0;j<cols;j++) {
				if(i==j) {
				
		            add+=arr[i][j];
		          i++;
				}          
			}
			sum[i]=add;

			  
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
		int result[]=sumOfCols(arr,rows,cols);
		for(int a:result) {
			System.out.println(a);
		}
		
}

	
}



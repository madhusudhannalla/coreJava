package com.ojas.strings;

import java.util.Scanner;

public class TwoDRowSum {
         static int[] sumOfRow(int[][] arr) {
        	 int result=0;
        	 int store[]=new int[arr.length];
        	 for(int i=0;i<arr.length;i++) {
        		 int add=0;
        		 for(int j=0;j<arr[i].length;j++) {
        			 add+=arr[i][j];
        		 }
        		store[i]= add;
        	 }
        	 
        	 return store;
        
              }
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
	     int rows=sc.nextInt();
	     System.out.println("enter the no of cols");
	     int cols=sc.nextInt();
	      int arr[][]=new int[rows][cols];
	      for(int i=0;i<arr.length;i++) {
	    	  System.out.println("enter " +(i+1)+" st row values");
	    	  for(int j=0;j<arr[i].length;j++) {
	    	arr[i][j]=sc.nextInt();		  
	    	  }
	      }
	      int result[]= sumOfRow(arr);
	      for(int aaa:result) {
	    	  System.out.print(aaa+" ");
	      }
	    	  
}
}



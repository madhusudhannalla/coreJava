package com.arrays.ojas.Assignments100521;

import java.util.Scanner;

public class ReadAndDisplayEvenNo {
	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  nmbers");
		int[] values=new int[5];
		for( i=0;i<values.length;i++) {
			values[i]=sc.nextInt();
			System.out.println(values[i]);
		}
		
		System.out.println("even values of array ");
	System.out.print(even(values));
}

	private static String even(int[] values) {
		String result="";
		for(int i=0;i<values.length;i++) {
			if(values[i]%2==0) {       
				int evenValues=values[i];
				result+=evenValues+"\n";
				
			}
		}
		return result;
	}
}

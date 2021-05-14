package com.arrays.ojas.Assignments100521;

import java.util.Scanner;

public class ReadAndBiggest {
	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  nmbers");
		int[] values=new int[10];
		for( i=0;i<values.length;i++) {
			values[i]=sc.nextInt();
			System.out.println(values[i]);
		}
		
		System.out.println("biggest of array values");
	System.out.println(biggest(values));
}

	private static int biggest(int[] values) {
		int biggest=values[0];
		for(int i=0;i<values.length;i++) {
			if(biggest<values[i]) {       
				biggest=values[i];
			}
		}
		return biggest;
	}
}

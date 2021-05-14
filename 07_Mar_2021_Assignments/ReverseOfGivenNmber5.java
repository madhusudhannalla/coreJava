package com.ojas.assignments070521;

import java.util.Scanner;


public class ReverseOfGivenNmber5{  
	static int reverse(int num) {
		int result=0;
		int reminder;
		while (num > 0) {
			reminder = num % 10;
			num = num / 10;
			result = result * 10 + reminder;
		}
		 return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nmber");
		System.out.println("reverse of given nmbr ::" +reverse(sc.nextInt()));
}
}
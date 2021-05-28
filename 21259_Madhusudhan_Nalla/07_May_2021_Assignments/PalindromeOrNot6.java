package com.ojas.assignments070521;

import java.util.Scanner;
public class PalindromeOrNot6{  
		static String palindrome(int num) {
			int reminder;
			int sum=0;
			int temp=num;
			while (num > 0) {
				reminder = num % 10;
				sum = sum * 10 + reminder;
				num = num / 10;
			}
			if(temp==sum) {
			return "is palindrome";
		}
			else
			return "not palindrome";
			}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a nmber");
			System.out.println(palindrome(sc.nextInt()));
	}
	}


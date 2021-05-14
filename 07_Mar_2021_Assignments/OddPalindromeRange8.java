package com.ojas.assignments070521;

import java.util.Scanner;

public class OddPalindromeRange8 {
	static boolean palindrome(int num) {
		int reminder;
		int sum = 0;
		int temp = num;
		while (num > 0) {
			reminder = num % 10;
			sum = sum * 10 + reminder;
			num = num / 10;
		}
		if (temp == sum && sum % 2 != 0) {
			return true;
		} 
		else {
			return false;
		}
	}

	static String isPalindromeRange(int start, int end) {
		String result = "";
		for (int i = start; i <= end; i++) {
			if (palindrome(i)) {
				result += i + " ";
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first nmber \n and");
		System.out.println("enter second nmber");
		System.out.println(isPalindromeRange(sc.nextInt(), sc.nextInt()));
	}

}

package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class IsPalindrome {
	public static int isPalindrome(int num) {
		int reminder;
		int sum = 0;
		int temp = num;
		if (num <= 0) {
			return -1;
		}
		if (num >= 100 && num < 1000) {
			while (num > 0) {
				reminder = num % 10;
				num = num / 10;
				sum = sum * 10 + reminder;
			}
			if (sum == temp) {
				return 1;
			} else
				return 0;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println(isPalindrome(num));
	}
}

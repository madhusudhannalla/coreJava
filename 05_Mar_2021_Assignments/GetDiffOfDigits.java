package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class GetDiffOfDigits {

	public static int getDiffOfDigits(int num) {
		int result = 0;
		int reminder = num % 10;
		int quotient = num / 10;
		if (num >= 10 && num <= 99) {
			result =  quotient-reminder;
		}
		else if (num < 0) {
			return -3;
		} else if (num > 99) {
			return -2;
		} else if (num >= 0 && num <= 9) {
			return -1;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nmbr");
		int num = sc.nextInt();
		System.out.println(getDiffOfDigits(num));
	}
}

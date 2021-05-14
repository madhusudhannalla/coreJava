package com.ojas.assignments070521;

import java.util.Scanner;

public class NumberOfDigits10 {
	static int numberOfDigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a nmber");
		System.out.println(numberOfDigits(sc.nextInt()));
	}
}

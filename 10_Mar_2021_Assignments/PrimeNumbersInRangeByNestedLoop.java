package com.ojas.assignments070521;

import java.util.Scanner;

public class PrimeNumbersInRangeByNestedLoop {
	static String strongNumber(int startNum, int endNum) {
		int count;
		String result = "";
		int i = startNum;
		for (i = startNum; i <= endNum; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				result += i + " ";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first nmber \n and");
		System.out.println("enter second nmber");
		System.out.println(strongNumber(sc.nextInt(), sc.nextInt()));
	}
}

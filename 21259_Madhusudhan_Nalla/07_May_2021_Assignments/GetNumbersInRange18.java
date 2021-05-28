package com.ojas.assignments070521;

import java.util.Scanner;

public class GetNumbersInRange18 {
	static String getNumbersInRange(int startVal, int endVal) {
		String result = " ";
		if (startVal - endVal == 1) {
			result = "-4";
		} else if (startVal == endVal) {
			result = "-2";
		} else if (startVal > 0 && endVal > 0) {
			if (startVal > endVal) {
				while (startVal - 1 > endVal) {
					result += startVal - 1 + " ";
					startVal--;
				}
			} else {
				result = "-3";
			}
		} else {
			result = "-1";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting and ending value");
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println(getNumbersInRange(start, end));

	}
}

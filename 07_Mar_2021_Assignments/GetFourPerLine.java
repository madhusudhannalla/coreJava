package com.ojas.assignments070521;

import java.util.Scanner;

public class GetFourPerLine {
	static String getFourPerLine(int value) {
		String result = "";
		int i = 1;
		if (value < 0) {
			result = "-1";
		} else if (value > 0 && value < 99) {
			while (i <= value) {
				result += i + " ";
				if (i % 4 == 0) {
					result += " \n";
				}
				i++;
			}
		} else if (value == 0) {
			result = "-2";
		} else {
			result = "-3";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int value = sc.nextInt();
		System.out.println(getFourPerLine(value));

	}
}

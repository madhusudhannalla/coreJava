package com.arrays.ojas.Assignments100521;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  nmbers");
		int[] values = new int[10];
		for (i = 0; i < values.length; i++) {
			values[i] = sc.nextInt();
			System.out.println(values[i]);
		}
		System.out.println("sort array values");
		System.out.println(sort(values));
	}

	private static String sort(int[] values) {
		int temp;
		String result = "";
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] > values[j]) {
					temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			}
			result += values[i] + " ";
		}
		return result;
	}
}

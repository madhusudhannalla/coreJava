package com.ojas.assignments070521;

import java.util.Scanner;

public class ArmStrongOrNot9 {
	static String armStrong(int num) {
		int reminder;
		int sum = 0;
		int temp = num;
		int len = length(num);
		while (num > 0) {
			reminder = num % 10;
			sum = (int) (sum + (Math.pow(reminder, len)));
			num = num / 10;
		}
		if (temp == sum) {
			return "is ArmStrong";
		} else {
			return "not ArmStrong";
		}
	}

	private static int length(int num) {
		int count = 0, reminder;
		while (num > 0) {
			// reminder = num % 10;
			num = num / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a nmber");
		System.out.println(armStrong(sc.nextInt()));
	}

}

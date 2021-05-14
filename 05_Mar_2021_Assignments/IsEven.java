package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class IsEven {
	public static int isEven(int num) {
		if (num > 0) {
			if (num % 2 == 0) {
				return 1;
			} else {
				return 0;
			}
		} else
			return -1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println(isEven(num));
	}
}

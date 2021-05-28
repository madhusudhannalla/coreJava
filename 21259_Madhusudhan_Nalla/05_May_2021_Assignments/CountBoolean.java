package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class CountBoolean {
	public static boolean countBoolean(boolean value1, boolean value2, boolean value3) {

		int count = 0;
		if (value1) {
			count++;
		}
		if (value2) {
			count++;
		}
		if (value3) {
			count++;
		}
		if (count >= 2) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		System.out.println(countBoolean(sc.nextBoolean(), sc.nextBoolean(), sc.nextBoolean()));

	}

}

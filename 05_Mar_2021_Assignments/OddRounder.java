package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class OddRounder {
	static int oddRounder(int num) {

		int result = 0;
		int reminder;
		int quotient;
		int devisor;
		devisor = 10;
		reminder = num % devisor;
		quotient = num / devisor;
		if (num < 0) {
			result = -1;
		} else if (num == 0) {
			result = -2;
		} else if (num % 2 == 0) {
			num = (quotient * devisor) + reminder;
			result = num;
		}
		else {
			result = (quotient + 1) * devisor;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(oddRounder(sc.nextInt()));
	}
}

package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class GetGreatest {
	public static int getGreatest(int value1, int value2) {
		if (value1 > 0 && value2 > 0) {
			if (value1 > value2) {
				return value1;
			} else
				return value2;
		} else if (value1 == 0 || value2 == 0) {
			return -2;
		} else
			return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		System.out.println(getGreatest(sc.nextInt(), sc.nextInt()));
	}

}

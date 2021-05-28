package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class GetNextMultipleOf100 {
	public static int getNextMultipleOf100(int num) {
		int result = 0;
		int quotient = 0;
		quotient = num / 100;
		quotient = (quotient + 1) * 100;
		if (num > 0) {
			result = quotient;
		} else {
			return -1;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nmbr");
		int num = sc.nextInt();
		System.out.println(getNextMultipleOf100(num));
	}
}

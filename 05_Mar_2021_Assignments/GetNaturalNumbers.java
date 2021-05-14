package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class GetNaturalNumbers {
	public static String getNaturalNumbers(int startval, int endval) {
		String result = "";
		int i = startval;
		while (i <= endval) {
			result += i + " ";
			i++;
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting and ending value");
		System.out.println(getNaturalNumbers(sc.nextInt(), sc.nextInt()));

	}
}

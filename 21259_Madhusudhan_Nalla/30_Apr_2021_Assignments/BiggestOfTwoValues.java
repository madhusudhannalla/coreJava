package com.nt.ojas.Assignments290421;

import java.util.Scanner;

public class BiggestOfTwoValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		int value1 = sc.nextInt();
		System.out.println("enter second value");
		int value2 = sc.nextInt();
		if (value1 > value2) {
			System.out.println(value1);
		} else
			System.out.println(value2);
	}
}

package com.nt.ojas.Assignments290421;

import java.util.Scanner;

public class BiggestOfThreeValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		int value1 = sc.nextInt();
		System.out.println("enter second value");
		int value2 = sc.nextInt();
		System.out.println("enter third value");
		int value3 = sc.nextInt();
		if (value1 > value2 && value1 > value3) {
			System.out.println("biggest value is::" + value1);
		} else if (value2 > value3 && value2 > value1) {
			System.out.println("biggest value is::" + value2);
		} else
			System.out.println("biggest value is::" + value3);
		sc.close();
	}
}

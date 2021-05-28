package com.ojas.assignments070521;

import java.util.Scanner;

public class SumOfFactors3 {
	static int factors(int n) {
		int fact = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				fact = fact + i;
			}
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a nmber");
		System.out.println("sum of factors ::" + factors(sc.nextInt()));
	}
}

package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class SumOfMultiples {
	static int roundValue(int number)
	{
		int total =0;
		if (number % 10 == 0) {
			return number;
		}
		else 
		{
			total += ((number/10)+1)*10;
		}
		return total;	
	}
	static int sumOfMultiples(int first, int second, int third) {
		if (first > 0 && second > 0 && third > 0) {
			return roundValue(first) + roundValue(second) + roundValue(third);
		} else
			return -1;
	}
	public static void main(String[] args) {
		System.out.println("Enter three numbers : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("The result is " + sumOfMultiples(num1, num2, num3));
	}
}

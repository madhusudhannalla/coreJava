package com.ojas.assignments;

public class ArmStrong {

	public static void main(String[] args) {

		try {
			int n = Integer.parseInt(args[0]);
			int sum = 0;
			int r = 0;
			int temp = n;
			if (n < 0 || args[0].length() != 4) {
				System.out.println("error");
			} // if
			else {

				while (n > 0) {
					r = n % 10;
					sum = sum + r * r * r * r;
					n = n / 10;

				} // while
				if (temp == sum) {
					System.out.println("armstrong");
				} // if
				else
					System.out.println("not armstrong");
			} // else
		} // try
		catch (Exception e) {
			System.out.println("error");
		} // catch

	}// main

}// class

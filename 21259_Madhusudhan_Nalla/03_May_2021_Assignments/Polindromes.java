package com.nt.ojas.Assignments030521;

public class Polindromes {
	public static boolean isPolindrome(int num) {
		int reminder;
		int sum = 0;
		int temp = num;
		while (num > 0) {
			reminder = num % 10;
			num = num / 10;
			sum = sum * 10 + reminder;
		}
		if (sum == temp) {
			return true;
		} else
			return false;
	}

	public static void main(String args[]) {
		int num = 0;
		try {
			num = Integer.parseInt(args[0]);
			if (num > 0) {
				System.out.println(isPolindrome(num));

			} else {
				System.out.println("error");
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}

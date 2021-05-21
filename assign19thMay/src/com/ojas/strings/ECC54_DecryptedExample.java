package com.ojas.strings;

import java.util.Scanner;

public class ECC54_DecryptedExample {

	public static String decrypt(String s) {

		int value = 0;
		int sum = 0;
		String result = "";
			for (int i = 0; i < s.length(); i++) {
				value = 'z' - s.charAt(i);
				value = 26 - value;
				sum += value;
				result = sum + "";

			}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		str = str.toLowerCase();
		System.out.println(decrypt(str));

	}
}

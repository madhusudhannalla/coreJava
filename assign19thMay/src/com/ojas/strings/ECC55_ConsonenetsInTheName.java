package com.ojas.strings;

import java.util.Scanner;

public class ECC55_ConsonenetsInTheName {
	static String findVowels(String name) {
		String res = "";
		char c;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'a' && name.charAt(i) != 'e' && name.charAt(i) != 'i' && name.charAt(i) != 'o'
					&& name.charAt(i) != 'u') {
				res+=name.charAt(i)+" ";
				} 
			
			}
		
		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		str = str.toLowerCase();
		System.out.println("consonents are in given name" );
		System.out.println(findVowels(str));

	}
}

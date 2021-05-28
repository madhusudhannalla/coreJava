package com.ojas.strings;

import java.util.Scanner;

public class ECC54_DecryptedExample {
	public static String decrypt(String s) {
		String result = "";	
		for (int i = 0; i < s.length(); i++) {
			int value='a'-s.charAt(i);
		    char res=(char)('z'+value);
			result+=res;
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

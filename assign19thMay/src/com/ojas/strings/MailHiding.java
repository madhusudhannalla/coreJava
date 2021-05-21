package com.ojas.strings;

import java.util.Scanner;

public class MailHiding {

	static String maskEmail(String mail) {
		StringBuffer mask = new StringBuffer(mail);
		
		for(int i = 2;mask.charAt(i) != '@';i++) {
			mask.setCharAt(i, '*');
		}
		
		return mask.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter MAIL ID");
		
		System.out.println("Mask mail is: \n" +maskEmail(sc.nextLine()));
	}

}

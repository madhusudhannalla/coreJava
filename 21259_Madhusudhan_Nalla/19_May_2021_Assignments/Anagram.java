package com.ojas.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
static StringBuffer sb1,sb2=null;
	static String isAnagram(String str1, String str2) {
		String result = "";
		if(str1.length() != str2.length()) {
			result = "not Anagram";
		}
		else {
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		    boolean status=Arrays.equals(ch1, ch2);
		     if(status) {
		    	 result+="anagram";
		     }
		     else
		    	 result+="not anagram";
		}
         return result;
	}
		
	
	static String stringAscending(String str) {
		StringBuffer res = new StringBuffer(str);
		for(int i = 0;i < res.length();i++) {
			for(int j = i + 1;j < res.length();j++) {
				if(res.charAt(i) > res.charAt(j)) {
					char temp = res.charAt(i);
					res.setCharAt(i, res.charAt(j));
					res.setCharAt(j, temp);
				}
			}
		}
		
		return res.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings ");
		System.out.println(isAnagram(sc.next(), sc.next()));
	}

}
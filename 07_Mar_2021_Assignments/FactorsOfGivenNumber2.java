package com.ojas.assignments070521;

import java.util.Scanner;

public class FactorsOfGivenNumber2 {
	
	     static String factors(int n) {
	    	 String result="";
	    			for (int i = 1; i < n; i++) {
	    				if (n % i == 0) {
	    					result += i + " ";
	    				}
	    			} 
	    			return result;
	    		} 
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a nmber");
			System.out.println("factors of given nmbr ::" +factors(sc.nextInt()));
	}

}

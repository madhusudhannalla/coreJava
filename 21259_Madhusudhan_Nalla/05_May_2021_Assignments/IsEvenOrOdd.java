package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class IsEvenOrOdd {
        static String isEvenOrOdd(int num) {
        	String result;
        	if(num<=0) {
        		result="invalid input";
        	}
        	else if(num%2==0) {
        		result ="Even";
        	}
        	else {
        		result="Odd";
        	}
        	return result;
        }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(isEvenOrOdd(sc.nextInt()));
	}
}

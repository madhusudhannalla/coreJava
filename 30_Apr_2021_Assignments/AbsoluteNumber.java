package com.nt.ojas.Assignments290421;

public class AbsoluteNumber{
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		int duplicateNmber = number * -1;
		if (number > 0) {
			System.out.println(number);
		} else
			System.out.println(duplicateNmber);
	}
}

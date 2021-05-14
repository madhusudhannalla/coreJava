package com.nt.ojas.Assignments290421;

public class SwapTwoNumbersWithTemporary {

	public static void main(String[] args) {
		int value1 = Integer.parseInt(args[0]);
		int value2 = Integer.parseInt(args[1]);
		System.out.println("before swap:\n value1::" + value1 + "\n " + "value2::" + value2);
		int temp = value1;
		value1 = value2;
		value2 = temp;
		System.out.println("after swap:\n value1::" + value1 + "\n " + "value2::" + value2);
	}

}

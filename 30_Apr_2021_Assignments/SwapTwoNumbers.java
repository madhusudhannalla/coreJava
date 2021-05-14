package com.nt.ojas.Assignments290421;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int value1 = Integer.parseInt(args[0]);
		int value2 = Integer.parseInt(args[1]);
		System.out.println("before swap:\n value1::" + value1 + "\n " + "value2::" + value2);
		value1 = value1 + value2;
		value2 = value1 - value2;
		value1 = value1 - value2;
		System.out.println("after swap:\n value1::" + value1 + "\n " + "value2::" + value2);

	}

}

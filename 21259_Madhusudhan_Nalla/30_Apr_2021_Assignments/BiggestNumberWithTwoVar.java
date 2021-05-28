package com.nt.ojas.Assignments290421;

public class BiggestNumberWithTwoVar {
	public static void main(String[] args) {
		int arr[] = new int[5];
		// System.out.println(arr.length);
		arr[0] = Integer.parseInt(args[0]);
		arr[1] = Integer.parseInt(args[1]);
		arr[2] = Integer.parseInt(args[2]);
		arr[3] = Integer.parseInt(args[3]);
		arr[4] = Integer.parseInt(args[4]);
		int i;
		int max = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}

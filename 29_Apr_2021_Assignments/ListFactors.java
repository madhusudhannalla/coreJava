package com.ojas.assignments;

public class ListFactors {

	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			if (n < 0)
				System.out.println("error");
			else {
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						System.out.print(i + " ");
					} // if
				} // for
			}
		} // try
		catch (Exception e) {
			System.out.println("error");
		} // catch

	}// main

}// class

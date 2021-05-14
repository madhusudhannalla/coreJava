package com.ojas.assignments;

public class AdditionOfListFactors {

	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			if (n < 0)
				System.out.println("error");
			else {
				int fact = 0;
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						fact = fact + i;
					} // if
				} // for
				System.out.println(fact);
			}//else
		} // try
		catch (Exception e) {
			System.out.println("error");
		} // catch

	}// main

}// class

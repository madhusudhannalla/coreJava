package com.ojas.assignments;

public class Factorial {

	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			if (n < 0)
				System.out.println("error");
			int fact = 1;
			int i = n;

			for (i = n; i <= n; i--) {
				if (i > 0)
					fact = fact * i;
			} // for
			System.out.println(fact);

		} // try
		catch (Exception e) {
			System.out.println("error");
		} // catch

	}// main
}// class

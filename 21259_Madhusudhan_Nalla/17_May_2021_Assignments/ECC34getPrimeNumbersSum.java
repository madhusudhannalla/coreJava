package assign18thMay;

import java.util.Scanner;

public class ECC34getPrimeNumbersSum {

	static String res = "";
	static int sum = 0;

	static String getPrimeNumbers(int start, int end) {
		if (start > end) {
			res += "-3";
		} else if (start == 0 || end == 0) {
			res += "-2";
		} else if (start > 0) {
			for (int i = start + 1; i < end; i++) {
				if (isPrime(i)) {
					sum += i;

				}
			} // for
			res += sum + " ";
		} // else if
		else
			res += "-1";

		return res;
	}

	static boolean isPrime(int start) {
		int count = 0;
		boolean b = false;
		for (int i = 1; i <= start; i++) {
			if (start % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			b = true;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entr  values");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		System.out.println(getPrimeNumbers(value1, value2));
	}
}

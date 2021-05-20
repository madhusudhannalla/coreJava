package assign18thMay;

import java.util.Scanner;

public class ECC52FibonacciNthTerm {
	static int getFibonacciSeries(int num) {
		String res = "";
		int a = 0, b = 1, c = a + b;

		if (num == 1) {
			res += a + " ";
		} else {
			res += a + " ";
			res += b + " ";
		}
            int count=0;
            int result=0;
		for (int i = 3; i <= num; i++) {
			res += c + " ";
			a = b;
			b = c;
			c = a + b;
			result=c-a;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");

		System.out.println("nth term is :" + getFibonacciSeries(sc.nextInt()));
	}

}

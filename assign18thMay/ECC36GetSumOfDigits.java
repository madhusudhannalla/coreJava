package assign18thMay;

import java.util.Scanner;

public class ECC36GetSumOfDigits {

	public static String getSumOfDigits(int num) {
		int l = length(num);
		int sum = 0;
		String result = "";
		if (num <= 0) {
			result = "error";
		} else {
			// for (int i = 1; i <= l; i++) {
			// if(num>0) {
			while (num > 0) {
				int reminder = num % 10;
				num = num / 10;
				sum = sum + reminder;
				result = String.valueOf(sum);
			}
			// }
		}
		return result;
	}
	private static int length(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nmbr");
		int num = sc.nextInt();
		System.out.println(getSumOfDigits(num));
	}
}
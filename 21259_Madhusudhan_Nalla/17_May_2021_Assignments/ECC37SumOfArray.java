package assign18thMay;

import java.util.Scanner;

public class ECC37SumOfArray {
	static int sumOfArray(int[] arr, int n) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (n == 0 || arr[i] == 0) {
				return -1;
			} else if (arr[i] < 0) {
				return -2;
			} else {
				sum = sum + arr[i];
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many u want to enter");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("enter the nmbrs");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sumOfArray(arr, num));
	}
}

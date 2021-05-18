package assign18thMay;

import java.util.Scanner;

public class ECC39GetCount {
	static int getCount(int arr[], int search, int num) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			// for(int j=i+1;j<arr.length;j++) {
			if (arr[i] == search) {
				count++;
			}
			// }
		}

		return count;
	}

	public static void main(String[] args) {
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nmbr of ele u want to enter");
		int num = sc.nextInt();
		if (num == 0) {
			System.out.println("-1");
			;
		} else {
			int arr[] = new int[num];
			System.out.println("enter the nmbrs");
			for (int i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("enter the element u want to search");
			int search = sc.nextInt();
			System.out.println(getCount(arr, search, num));
		}
	}
}

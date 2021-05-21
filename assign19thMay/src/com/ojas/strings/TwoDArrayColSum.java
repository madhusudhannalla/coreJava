package com.ojas.strings;

import java.util.Scanner;

public class TwoDArrayColSum {

	static int[] getColumnSum(int[][] arr,int row,int col) {
		int[] sum = new int[col];

		for (int i = 0; i < row; i++) {
			int add = 0;
			
				for (int j = 0; j < col; j++) {

					add = add + arr[j][i];
				}
				sum[i] = add;
			} 
		
		return sum;

	}

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter row Size :");
			int row = scanner.nextInt();
			System.out.println("Enter column Size :");
			int col = scanner.nextInt();

			int arr[][] = new int[row][col];
			for (int i = 0; i < row; i++) {
				System.out.println("Enter " + (i + 1) + " row Elements ");

				for (int j = 0; j < col; j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			int[] rowSum = getColumnSum(arr,row,col);

			for (int x : rowSum) {
				System.out.print(x + " ");
			}
		
	}

}

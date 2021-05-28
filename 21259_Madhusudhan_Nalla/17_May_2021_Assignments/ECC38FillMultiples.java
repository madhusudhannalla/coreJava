package assign18thMay;

import java.util.Scanner;

public class ECC38FillMultiples {
		static int[] getMultiplesArray(int number) {
			int[] res = new int[10];
			
			if(number <= 0) {
				return null;
			}
			else {
				
				for(int i = 0;i < res.length;i++) {
					res[i] = number * (i+1);
				}
				
				return res;
			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any number: ");
			int[] output = getMultiplesArray(sc.nextInt());
			if(output == null)
				System.out.println("null");
			else {
				
				for(int i = 0;i < output.length; i++) {
					System.out.print(output[i]+" ");
				}
				
			}
		}
}
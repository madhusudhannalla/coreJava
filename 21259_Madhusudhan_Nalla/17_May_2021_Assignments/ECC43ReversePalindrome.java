package assign18thMay;

import java.util.*;
public class ECC43ReversePalindrome {
	static String result="";
	
	static String getPolindromeList(int num) {
		int x, r, rev=0, sum;
		x=num;
		result = result + x ;
		
		while(num > 0) {
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		
		if(rev == x) {
			return result;
		}
		
		result = result + "," + rev + ",";
		sum = x + rev;
		
		return getPolindromeList(sum);
	}
	
	static boolean check(int num) {
		
		if((num < 100) || (num >= 1000)) {
			System.out.println("Error");
			return false;
		}
		else {
			return true;
		}
				
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		
		if(check(num)) {
			System.out.println(getPolindromeList(num));
		}
	}
}



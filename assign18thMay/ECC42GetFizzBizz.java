package assign18thMay;

import java.util.Scanner;

public class GetFizzBizz {
	
	static String getFizzBizz(int num) {
		String result="";
		 if(num%5==0 && num%3==0) {
			result+="fizzbizz";
		 }
			else if(num%3==0) {
			result+="fizz";
		}
		else if(num%5==0) {
			result+="bizz";
		}
		
		else
			result+=num;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entr 3 values");
		int value = sc.nextInt();
		
		System.out.println(getFizzBizz(value));
	}
}

package assign18thMay;

import java.util.Scanner;

public class ECC32FindTriangle {

	static String findTriangle(int value1, int value2, int value3) {
		String res = "";
		if (value1 == 0 || value2 == 0 || value3 == 0) {
			res += "-1";
		}
		else if (value1 > 0 && value2 > 0 && value3 > 0) {
			if ((value1 + value2) > value3 || (value2 + value3) > value1 || (value1 + value3) > value2) {
				if (value1 == value2 && value2 == value3 && value1 == value3) {
					res += "equalateral triangle";
				} else if (value1 == value2 || value2 == value3 || value1 == value3) {
					res += "ISOSCELES triangle";
				} else if(value1 != value2 || value2 != value3 || value1 != value3) {
					res+="scalene";
				}//if inner
			}//if 
			else
				res += "-3";
		} // else if
		else
			res += "-2";

		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entr 3 values");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		System.out.println(findTriangle(value1, value2, value3));
	}

}

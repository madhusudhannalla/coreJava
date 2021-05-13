import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nmber");
		int num = sc.nextInt();
		System.out.println(strongnum(num));
	}

	static String strongnum(int num) {
		String result = "";
		int temp = num;
		int reminder = 0;
		int sum = 0;
		while (temp > 0) {
			int fact = 1;
			int i = 1;
			reminder = temp % 10;
			while (reminder >= i) {
				fact = fact * i;
				i++;
			}
			sum = sum + fact;
			temp = temp / 10;
		}
		if (num == sum)
			return "strong number";
		else
			return "not a strong  number";
	}
}

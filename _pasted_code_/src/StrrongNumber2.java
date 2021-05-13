import java.util.Scanner;

public class StrrongNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nmber");
		int num = sc.nextInt();
		System.out.println(strongOrNot(num));
	}
	
	
	static String strongOrNot(int num) {
		int temp=num;
		int sum=0;
		int cal=0;
		while(temp!=0) {
			sum=sum+fact(temp%10);
			temp=temp/10;
		}
		if(sum==num)
		return "given number is strong number ";
		else
			return "given number is not a strong number";
	}
	
	
	
	static int fact(int num) {
		int fact=1;
		int i=1;
		while(num>=i) {
			fact=fact*i;
			i++;
		}
		return fact;	
	}
}

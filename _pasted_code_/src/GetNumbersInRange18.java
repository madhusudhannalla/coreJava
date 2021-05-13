import java.util.Scanner;

public class GetNumbersInRange18 {
 public static String getNumbersInRange(int start_value,int end_value) {
	 String result="";
	 if(start_value==end_value) {
		 result+=-2;
	 }
	 else if(start_value>end_value) {
		 result+=-3;
	 }
	 else if((start_value<0||end_value<0)) {
		 result+=-2;
	 }
	 else {
		 int i=start_value+1;
		 while(i<end_value) {
			 result+=i+" ";
			 i++;
		 }
		 
	 }
	 return result;
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nmbers");
		System.out.println(getNumbersInRange(sc.nextInt(),sc.nextInt()));

	}      
	}

import java.util.Scanner;

public class RussianMultiply {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter a nmbr");
		System.out.println(russianMultiply(sc.nextInt(),sc.nextInt()));

	}

	private static int russianMultiply(int firstNum,int secNum) {
		int product=0;
		product+=secNum;
                while(firstNum!=0) {
                	firstNum=firstNum/2;
                	 secNum=secNum*2;
                if(firstNum%2!=0) {
                	product=product+secNum;
                }
                }
				return product;

	}

}

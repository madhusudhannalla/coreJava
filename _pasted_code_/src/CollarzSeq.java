import java.util.Scanner;

public class CollarzSeq {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter a nmbr");
		System.out.println(collarz(sc.nextInt()));

	}

	private static  String collarz(int num) {
		String result=num+"";
		while(num!=1) {
			if(num%2==0) {
				num=num/2;
				result=result+" "+num;
				
			}
			else {
				num=(num*3)+1;
			result=result+" "+num;
			}
			}
		return result;
	}
			
		}
	         


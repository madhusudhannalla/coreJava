import java.util.Scanner;

public class DecimalTobinary {
static String decimal(int num) {
	String result="";
	String result1="";
	int binery[]=new int[40];
	int count=0;
	while(num>0) {
		
		int reminder=num%2;
		binery[count]=reminder;
		result=result+binery[count]+" ";
		count++;
		num=num/2;
		
	}
	System.out.println(count);
	for(int i=count-1;i>=0;i--) {
		 result1+=binery[i]+" ";
	}
	return result1;
}
	
	/*int reminder = 0;
	int count=0;
	int octal[]=new int[8];
	
	while(num>0) {
		num=num/2;
		octal[count++]=(num%8);
		
		
	}
	int i=0;
	int result=0;
	for( i=7;i>=0;i--) {
		result= octal[i];
    } 
	return result;
	
}*/
       
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nmber");
		System.out.println(decimal(sc.nextInt()));

	}    

}





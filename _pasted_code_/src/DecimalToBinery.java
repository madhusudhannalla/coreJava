import java.util.Scanner;

/*public class DecimalToBinery {
static String decimal(int num) {
	String reminder="";
	int index=0;
	while(num>0) {
		num=num/2;
		reminder=reminder+" "+(num%2);
		
		
	}
	               
	return reminder;
}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nmber");
		System.out.println(decimal(sc.nextInt()));

	}    

}*/
class DecimalToBinery
{
    public static void main(String args[])
    {   
        int z = 1,temp, decimal_number,rem;
        int binary_number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nEnter A Decimal Number:t");
        decimal_number = sc.nextInt();
        temp = decimal_number;  
        while(decimal_number > 0)
        {
            rem = decimal_number%2;
            decimal_number = decimal_number/2;
            binary_number = binary_number + (z*rem);
            z = z*10;
        }
        System.out.println("nBinary Equivalent of Decimal Number " + temp + " = " + binary_number  );
    }
}





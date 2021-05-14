import java.util.Scanner;

public class SumOfRoundedValues {
      static int sumOfRoundedValues(int value1,int value2,int value3) {
    	  int result;
    	  if(value1>0 && value2 >0 && value3 >0) {
    	  if(value1%10>=5) {
    		  value1=((value1/10)+1)*10;
    	  }
    	  else if(value1%10<5) {
    		  value1=(value1/10)*10;
    	  }
    	  if(value2%10>=5) {
    		  value2=((value2/10)+1)*10;
    	  }
    	  else if(value2%10<5) {
    		  value2=(value2/10)*10;
    	  }  
    	  if(value3%10>=5) {
    		  value3=((value3/10)+1)*10;
    	  }
    	  else if(value3%10<5) {
    		  value3=(value3/10)*10;
    	  }
    	  result=value1+value2+value3;
    	  
    	  return result;
    	  }
    	  else 
    		  return -1;
      }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three nmbers");
		System.out.println(sumOfRoundedValues(sc.nextInt(),sc.nextInt(),sc.nextInt()));

	}

}

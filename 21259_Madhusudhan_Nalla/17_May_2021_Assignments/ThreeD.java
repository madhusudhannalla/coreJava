import java.util.Scanner;

public class ThreeD {
       
	public static void main(String[] args) {
    	  int college[][][]=new int[2][2][4];
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter college info");
    	  for(int i=0; i<college.length;i++) {
    		  for(int j=0; j<college[i].length;j++) {
    			  System.out.println("enter "+(i+1)+" branch "+(j+1) + "stud "+college[i][j].length+" sub marks");
    			  for(int k=0; k<college[i][j].length;k++) {
    				  college[i][j][k]=sc.nextInt();
    			  }
    		  }
    	  }
    	  System.out.println("college info");
    	  for(int i=0; i<college.length;i++) {
    		  for(int j=0; j<college[i].length;j++) {
    			  for(int k=0; k<college[i][j].length;k++) {
    				  System.out.print(college[i][j][k]+" ");
    				  
    			  }
    			  System.out.println();
    		  }
    		  System.out.println("*************");
    	  }
	}

}

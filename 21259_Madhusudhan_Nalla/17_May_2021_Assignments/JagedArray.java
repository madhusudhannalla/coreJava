import java.util.Scanner;

public class JagedArray {
       
	public static void main(String[] args) {
    	  int student[][]=new int[3][];
    	  student[0]=new int[3];
    	  student[1]=new int[2];
    	  student[2]=new int[1];
    	  Scanner sc=new Scanner(System.in);
    	  
    	  for(int i=0; i<student.length;i++) {
    		  System.out.println("enter "+(i+1)+ " stud "+student[i].length+" sub marks");
    	  
    	  for(int j=0; j<student[i].length;j++) {
    		  student[i][j]=sc.nextInt();  
    			  } 
    	  }
    	  
    	  System.out.println("student info");
    	  for(int i=0; i<student.length;i++) {
    		  System.out.println((i+1)+ " stud "+student[i].length+" sub marks");
    	  
    	  for(int j=0; j<student[i].length;j++) {
    		  System.out.print(student[i][j]+" ");  
    			  } 
    	  }
    	  
	}

}

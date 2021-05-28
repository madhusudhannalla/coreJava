package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class FindSign {
        public static int findSign(int num) {
        	int result;
        	
        	if(num>0) {
        		result=1;
        	}
        	else if(num==0) {
        		result=0;
        	}
        	else {
        		result=-1;
        	}
        	return result;
        }
        public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("enter the number");
    		System.out.println(findSign(sc.nextInt()));
    	}
}

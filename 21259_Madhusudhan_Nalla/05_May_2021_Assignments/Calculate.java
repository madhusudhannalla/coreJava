package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class Calculate {
  static int calculate(int num) {
	  int result;
	  if(num<=0) {
		  result=-1;
	  }
	  else if(num%2==0) {
		  result=num*num*num;
	  }
	  else {
		  result=num*num*num;
	  }
	  return result;
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(calculate(sc.nextInt()));
	}
}

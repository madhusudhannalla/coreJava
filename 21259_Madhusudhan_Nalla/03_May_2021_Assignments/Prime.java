package com.nt.ojas.Assignments030521;

public class Prime {

	public static boolean isPrime(int num) {
		int i=1;
		int count=0;
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}	
		}
		if(count==2)
			return true ;
		else
			return false;
	}
	public static void main(String[] args) {
		try {
		int num=Integer.parseInt(args[0]);
		if (num > 0) {
             System.out.println(isPrime(num));
	}
		 else {
			System.out.println("error");

}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}

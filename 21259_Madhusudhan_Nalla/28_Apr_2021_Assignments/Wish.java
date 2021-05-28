package com.ojas.assignments;

public class Wish {

	public static void main(String[] args) {
		String n=args[0];
		String n1=args[1];
		if(n.equals("AM"))
		System.out.println("Good morning "+n1);
		else if(n.equals("PM"))
			System.out.println("Good evening "+n1);
		else 
			System.out.println("first arg should be either AM or PM");
	}//main

}//class

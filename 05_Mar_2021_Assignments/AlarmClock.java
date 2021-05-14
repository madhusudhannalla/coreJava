package com.nt.ojas.methodAssignments;

import java.util.Scanner;

public class AlarmClock {
	public static String ringAlarm(int day, boolean value1) {
		String value = String.valueOf(value1);
		String res = "";
		if ((day >= 0 && day <= 6) && (value.equals("true") || value.equals("false"))) 
		{
			if ((day > 0 && day < 6) && (value.equals("true"))) {
				res = " " + ("10:00");
			} else if ((day > 0 && day < 6) && (value.equals("false"))) {
				res = " " + ("7:00");
			} else if ((day == 0 || day == 6) && (value.equals("true"))) {
				res = "OFF";
			} else {
				res = " " + ("10:00");
			}

		}

		else {
			res = " Invalid Inputs";
		}
		return res;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter day and boolean value");
		System.out.println(ringAlarm(sc.nextInt(), sc.nextBoolean()));

	}
}

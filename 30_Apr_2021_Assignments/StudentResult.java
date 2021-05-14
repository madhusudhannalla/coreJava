package com.nt.ojas.Assignments290421;

public class StudentResult {

	public static void main(String args[]) {
		int telugu;
		int english;
		int maths;
		int science;
		int social;
		telugu = Integer.parseInt(args[0]);
		english = Integer.parseInt(args[1]);
		maths = Integer.parseInt(args[2]);
		science = Integer.parseInt(args[3]);
		social = Integer.parseInt(args[4]);
		int total;
		float avg;
		if (telugu >= 35 && english >= 35 && maths >= 35 && science >= 35 && social >= 35) {
			total = telugu + english + maths + science + social;
			avg = total / 5;
			System.out.println("total::" + total);
			System.out.println("avg::" + avg);
			if (avg > 50) {
				System.out.println("c grade");
			} else if (avg > 60)
				System.out.println("B grade");
			else if (avg > 70)
				System.out.println("A grade");
		} else
			System.out.println("fail");
	}
}

//class
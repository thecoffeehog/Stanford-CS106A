/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	private int a,b,d;
	
	public void calValue() {
		println("Enter the values to compute Pythagorean theorem.");
		a=readInt("a: ");
		b=readInt("b: ");
		d=a*a+b*b;
		double c=Math.sqrt(d);
		println("c:"+c);
	}
	public void run() {
		calValue();
	}
}

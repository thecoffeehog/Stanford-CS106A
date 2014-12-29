/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	private int num;
	private int count;
	private void hailstone() {
		num=readInt("Enter a number: ");
		while(num!=1) {
			if(num%2!=0)
			{
				print(+num);
				println(" is odd so I make 3n+1 "+((num*3)+1));
				num=(num*3)+1;
				count++;
			}
			else
			{
				print(+num);
				println(" is even so I take half "+num/2);
				num=num/2;
				count++;
			}
		}
		println("This process took "+count+" to reach 1");
	}
	public void run() {
		hailstone();
	}
}


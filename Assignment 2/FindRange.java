/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	private double SENTINEL=0;
	public void run() {
		println("This program finds the largest and the smallest number");
		int firstNumber=readInt("?");
		if(firstNumber==SENTINEL)
		{
		  println("This is the sentinel value!");
		}
		int smallestNumber = firstNumber;
		int largestNumber = firstNumber;
		while(firstNumber!=SENTINEL) {
			int secondNumber=readInt("?");
			if((secondNumber<smallestNumber)&&(secondNumber!=SENTINEL))
			{
				smallestNumber=secondNumber;
			}
			if(secondNumber>largestNumber)
			{
				largestNumber=secondNumber;
			}
			if(secondNumber==SENTINEL)
			{
				break;
			}
		}
		println("Smallest Number: "+smallestNumber);
		println("Largest Number: "+largestNumber);
		
	}
}


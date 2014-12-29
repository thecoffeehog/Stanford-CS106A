/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
   int n=0;
	public void putBeeperMove()
	{
         putBeeper();
         move();
		if(frontIsClear())
		 move();
		else
		 {
		turnLeft();
			if(n%2==0)
			{
			move();
			turnLeft();
			n++;
			}
			else
			{
				turnLeft();
				turnLeft();
				move();
				turnLeft();
				turnLeft();
				turnLeft();
				n++;
			}
		
		}
	}
	public void run(){
		while(frontIsClear())
		putBeeperMove();
	}
};
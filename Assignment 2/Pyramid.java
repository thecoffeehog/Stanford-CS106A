/*
 * File: Pyramid.java
 *
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	private double w;
	private double h;
	private double bricksInRow;
	public void run() {

		for(int row=0;row<BRICKS_IN_BASE;row++)
		{
		//Calculates the no. of bricks to be printed in a row
		bricksInRow=BRICKS_IN_BASE-row;

			for(int numOfBricks=0;numOfBricks<bricksInRow;numOfBricks++)
			{
				//Formula for calculation of width
		        w=getWidth()/2+numOfBricks*BRICK_WIDTH-(BRICK_WIDTH * bricksInRow)/2;

				//Formula for calculation of height
				h=getHeight()-BRICK_HEIGHT*(row+1);

			//Declaring a variable of GRect Class
			 GRect Brick= new GRect(w,h,BRICK_WIDTH,BRICK_HEIGHT);

			 //Printing the brick
	         add(Brick);
	         }

		}
	}
}


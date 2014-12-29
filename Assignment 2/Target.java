/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Target extends GraphicsProgram {
	
	private void addBiggestCircle() {
		double radius=72; //In Pixels
		double diameter=radius*2;
		//Using diameter as width and height
		GOval biggestCircle= new GOval(getWidth()/2-radius,getHeight()/2-radius,diameter,diameter);
		biggestCircle.setFilled(true);
		biggestCircle.setColor(Color.RED);
		add(biggestCircle);
	}
	private void addWhiteCircle() {
		double radius=(72*65)/100;//Converting the radius in Pixels
		double diameter=radius*2;
		//Using diameter as width and height
		GOval whiteCircle= new GOval(getWidth()/2-radius,getHeight()/2-radius,diameter,diameter);
		whiteCircle.setFilled(true);
		whiteCircle.setColor(Color.WHITE);
		add(whiteCircle);
	}
	private void addMiddleCircle() {
		double radius=(72*3)/10;//Converting the radius in Pixels
		double diameter=radius*2;
		//Using diameter as width and height
		GOval middleCircle= new GOval(getWidth()/2-radius,getHeight()/2-radius,diameter,diameter);
		middleCircle.setFilled(true);
		middleCircle.setColor(Color.RED);
		add(middleCircle);
		
	}
	
	public void run() {
	
		addBiggestCircle();
		addWhiteCircle();
		addMiddleCircle();
	}
}

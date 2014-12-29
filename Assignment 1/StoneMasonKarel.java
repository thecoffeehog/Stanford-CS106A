/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
public void fixColumn() {
	if(!beepersPresent())
	{
		putBeeper();
	}
}
public void moveBetweenWalls() {
	for(int i=0;i<4;i++)
	move();
}
public void putBBWalls()
{
   	
	while(frontIsClear())
	{
		
        fixColumn();
        move();
    }
}
public void run()
{
	
	turnLeft();
	putBBWalls();
	if(!frontIsClear())
	turnRight();//first wall fixed
	moveBetweenWalls();
	turnRight();
	putBBWalls();
	turnLeft();//second wall fixed
	moveBetweenWalls();
	turnLeft();
	putBBWalls();
	if(!frontIsClear())
	turnRight();//third wall fixed
	moveBetweenWalls();
	turnRight();
	putBBWalls();
	turnLeft();//fourth wall fixed
	
	
	
}
}
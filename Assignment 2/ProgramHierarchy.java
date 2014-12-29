/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	private static final int WIDTH=120;
	private static final int HEIGHT=40;
	private void programBox() {
		GRect prog= new GRect((getWidth()/2)-(WIDTH/2),(getHeight()/2)-HEIGHT,WIDTH,HEIGHT);
		GLabel label= new GLabel("Program",(getWidth()/2)-(WIDTH/2),(getHeight()/2)-HEIGHT);
		add(prog);
		add(label);
		double boxCenterX = WIDTH/2;
		double boxCenterY = HEIGHT/2;
		double halfOfLabelWidth = label.getWidth()/2; 
		double halfOfLabelHeight = label.getAscent()/2;
		label.move( (boxCenterX - halfOfLabelWidth) , (boxCenterY + halfOfLabelHeight) ); 
	}
	private void consoleProgramLine() {
		double x0=getWidth()/2;
		double y0=getHeight()/2;
		double x=getWidth()/2;
		double y=getHeight()/2+HEIGHT;
		GLine cPLine= new GLine(x0,y0,x,y);
		add(cPLine);
	}
	private void consoleProgramBox() {
		GRect console= new GRect((getWidth()/2)-(WIDTH/2),(getHeight()/2+2*HEIGHT)-HEIGHT,WIDTH,HEIGHT);
		GLabel label= new GLabel("Console Program",(getWidth()/2)-(WIDTH/2),(getHeight()/2+2*HEIGHT)-HEIGHT);
		add(console);
		add(label);
		double boxCenterX = WIDTH/2;
		double boxCenterY = HEIGHT/2;
		double halfOfLabelWidth = label.getWidth()/2; 
		double halfOfLabelHeight = label.getAscent()/2;
		label.move( (boxCenterX - halfOfLabelWidth) , (boxCenterY + halfOfLabelHeight) );
	}
	private void graphicsProgramBox() {
		GRect graphics= new GRect((getWidth()/2)-3*(WIDTH/2)-20,(getHeight()/2+2*HEIGHT)-HEIGHT,WIDTH,HEIGHT);
		GLabel label= new GLabel("Graphics Program",(getWidth()/2)-3*(WIDTH/2)-20,(getHeight()/2+2*HEIGHT)-HEIGHT);
		add(graphics);
		add(label);
		double boxCenterX = WIDTH/2;
		double boxCenterY = HEIGHT/2;
		double halfOfLabelWidth = label.getWidth()/2; 
		double halfOfLabelHeight = label.getAscent()/2;
		label.move( (boxCenterX - halfOfLabelWidth) , (boxCenterY + halfOfLabelHeight) );
	}
	private void graphicsProgramLine() {
		double x0=getWidth()/2;
		double y0=getHeight()/2;
		double x=(getWidth()/2)-2*(WIDTH/2)-20;
		double y=getHeight()/2+HEIGHT;
		GLine cPLine= new GLine(x0,y0,x,y);
		add(cPLine);
	}
	private void dialogProgramBox() {
		GRect dialog= new GRect((getWidth()/2)+(WIDTH/2+20),(getHeight()/2+2*HEIGHT)-HEIGHT,WIDTH,HEIGHT);
		GLabel label= new GLabel("Dialog Program",(getWidth()/2)+(WIDTH/2)+20,(getHeight()/2+2*HEIGHT)-HEIGHT);
		add(dialog);
		add(label);
		double boxCenterX = WIDTH/2;
		double boxCenterY = HEIGHT/2;
		double halfOfLabelWidth = label.getWidth()/2; 
		double halfOfLabelHeight = label.getAscent()/2;
		label.move( (boxCenterX - halfOfLabelWidth) , (boxCenterY + halfOfLabelHeight) );
	}
	private void dailogProgramLine() {
		double x0=getWidth()/2;
		double y0=getHeight()/2;
		double x=(getWidth()/2)+2*(WIDTH/2)+20;
		double y=getHeight()/2+HEIGHT;
		GLine cPLine= new GLine(x0,y0,x,y);
		add(cPLine);
	}
	public void run() {
		programBox();
		consoleProgramLine();
		consoleProgramBox();
		graphicsProgramLine();
		graphicsProgramBox();
		dialogProgramBox();
		dailogProgramLine();
		
	}
}


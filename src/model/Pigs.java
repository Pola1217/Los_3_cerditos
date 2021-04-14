package model;


import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Pigs extends Elements {
	
	public PApplet app;
	
	private PImage bigP, bigP1;
	private PImage mediP, mediP1;
	private PImage smallP, smallP1;
	
	private boolean match;
	
	
	
	public Pigs (PApplet app, int X, int Y, int width, int height) {

		super(app, X, Y, width, height);
		
		this.app = app;
		
		//big
		bigP = app.loadImage("./data/Pig1.PNG");
		bigP1 = app.loadImage("./data/Pig1.1.PNG");

		//middle
		mediP = app.loadImage("data/Pig2.png");
		mediP1 = app.loadImage("data/Pig2.1.PNG");
		
		//little
		smallP = app.loadImage("data/Pig3.PNG");
		smallP1 = app.loadImage("data/Pig3.1.PNG");
		
		//boolean
		match = true;
		
	}
	
//	public void draw1 () {
//		
//		app.imageMode(PConstants.CENTER);
//		app.image(bigP, X, Y, width, height);
//		app.imageMode(PConstants.CORNER);
//				
//		
//	}
	//big happy
	public void drawBig () {
		
		if (match == true) {
		
		app.imageMode(PConstants.CENTER);
		app.image(bigP1, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
		}
		
	}
	
	public void drawBig1 () {
		
		app.imageMode(PConstants.CENTER);
		app.image(bigP, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
	}
	
	
	
	public void drawMedium () {
		
		if (match == true) {
		
		app.imageMode(PConstants.CENTER);
		app.image(mediP1, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
		}
	}
	
	public void drawMedium1 () {
		
		app.imageMode(PConstants.CENTER);
		app.image(mediP, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
	}
	
	public void drawSmall () {
		
		if (match == true) {
			
		
		app.imageMode(PConstants.CENTER);
		app.image(smallP1, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
		}
	}
	
	public void drawSmall1 () {
		
		app.imageMode(PConstants.CENTER);
		app.image(smallP, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
	}

	public PImage getBigP() {
		return bigP;
	}

	public void setBigP(PImage bigP) {
		this.bigP = bigP;
	}

	public PImage getBigP1() {
		return bigP1;
	}

	public void setBigP1(PImage bigP1) {
		this.bigP1 = bigP1;
	}

	public PImage getMediP() {
		return mediP;
	}

	public void setMediP(PImage mediP) {
		this.mediP = mediP;
	}

	public PImage getMediP1() {
		return mediP1;
	}

	public void setMediP1(PImage mediP1) {
		this.mediP1 = mediP1;
	}

	public PImage getSmallP() {
		return smallP;
	}

	public void setSmallP(PImage smallP) {
		this.smallP = smallP;
	}

	public PImage getSmallP1() {
		return smallP1;
	}

	public void setSmallP1(PImage smallP1) {
		this.smallP1 = smallP1;
	}

	public boolean isMatch() {
		return match;
	}

	public void setMatch(boolean match) {
		this.match = match;
	}
	
	
	

}


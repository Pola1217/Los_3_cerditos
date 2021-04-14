package model;


import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Wolf extends Elements {
	
	private PImage WOLF, WBLOW, WBURN;
	
	int  x, y, size;
	
	
	public Wolf (PApplet app, int X, int Y, int width, int height) {
		
		super(app, X, Y, height, width);
		
		WOLF = app.loadImage("data/Lobo1.PNG");
		WBLOW = app.loadImage("data/Lobo2.PNG");
		WBURN = app.loadImage("data/Lobo3.PNG");
		
		this.x = X;
		this.y = Y;
		
		
	}
	
	public void draw (PApplet app) {
		
		app.imageMode(PConstants.CENTER);
		app.image(WOLF, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
				
	}
	public void draw1 (PApplet app) {
		
		app.imageMode(PConstants.CENTER);
		app.image(WBLOW, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
	}
	
	public void draw2 (PApplet app) {
		
		app.imageMode(PConstants.CENTER);
		app.image(WBURN, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
	}
	
}

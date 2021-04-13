package model;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Wolf extends Elements {
	
	private PImage WOLF;
	
	int  x, y;
	
	
	public Wolf (PApplet app, int X, int Y) {
		
		WOLF = app.loadImage("data/Lobo1.PNG");
		
		this.x = X;
		this.y = Y;
		
	}
	
	public void draw (PApplet app) {
		
		app.imageMode(PConstants.CENTER);
		app.image(WOLF, x, y, 170, 170);
		app.imageMode(PConstants.CORNER);
				
	}
	

}

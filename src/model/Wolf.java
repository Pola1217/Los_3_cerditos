package model;


import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Wolf extends Elements {
	
	public PApplet app;
	
	private PImage WOLF, WBLOW, WBURN;
	
	private int wolf;
	
	public Wolf (PApplet app, int X, int Y, int width, int height) {
		
		super(app, X, Y, height, width);
		
		this.app = app;
		
		WOLF = app.loadImage("data/Lobo1.PNG");
		WBLOW = app.loadImage("data/Lobo2.PNG");
		WBURN = app.loadImage("data/Lobo3.PNG");
		
		
	}
	
	public void draw (PApplet app) {
		
		switch(wolf) {
		
		case 0:
			
			app.image(WOLF, X, Y, width, height);

			break;
			
		case 1:
			
			app.image(WBLOW, X, Y, width, height);

			break;
			
		case 2:
			
			app.image(WBURN, X, Y, width, height);

			break;
		
		}
		
		app.imageMode(PConstants.CENTER);
				app.imageMode(PConstants.CORNER);
				
	}
	
	
}

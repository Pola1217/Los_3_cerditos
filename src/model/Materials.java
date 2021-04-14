package model;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Materials extends Elements {
	
	public PApplet app;
	
	private PImage wood, straw, brick;
	

	public Materials (PApplet app, int X, int Y, int width, int height) {
		
		super(app, X, Y, width, height);
		
		this.app = app;
		
		wood = app.loadImage("data/Madera.PNG");
		straw = app.loadImage("data/Paja.PNG");
		brick = app.loadImage("data/Ladrillo.PNG");
		
	}
	
	public void drawB () {
		
		this.app.imageMode(PConstants.CENTER);
		this.app.image(brick, X, Y, width, height);
		this.app.imageMode(PConstants.CORNER);
		
	}
	
	public void drawW () {
		
		//if (app == null){
			
			//System.out.print("es nulo mija");
			
		this.app.imageMode(PConstants.CENTER);
		this.app.image(wood, X, Y, width, height);
		this.app.imageMode(PConstants.CORNER);
		
		//}
	}
	
	public void drawS () {
		
		app.imageMode(PConstants.CENTER);
		app.image(straw, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
	}

//	


	public PImage getWood() {
		return wood;
	}


	public void setWood(PImage wood) {
		this.wood = wood;
	}


	public PImage getStraw() {
		return straw;
	}


	public void setStraw(PImage straw) {
		this.straw = straw;
	}


	public PImage getBrick() {
		return brick;
	}


	public void setBrick(PImage brick) {
		this.brick = brick;
	}


//	public int getX() {
//		return x;
//	}
//
//
//	public void setX(int x) {
//		this.x = x;
//	}
//
//
//	public int getY() {
//		return y;
//	}
//
//
//	public void setY(int y) {
//		this.y = y;
//	}

}

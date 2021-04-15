package model;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Fireplace extends Elements {
	
	public PApplet app;
	
	private PImage fire;
	
	private boolean match;
	
	public Fireplace (PApplet app, int X, int Y, int width, int height) {
		
			super(app, X, Y, width, height);
		
		this.app = app;
		
		fire = app.loadImage("./data/fogota.png");
		
		this.match = true;
		
	}
	
	public void draw () {
		
		if (match) {
		
		app.imageMode(PConstants.CENTER);
		app.image(fire, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
		}
		
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public PImage getFire() {
		return fire;
	}

	public void setFire(PImage fire) {
		this.fire = fire;
	}

	public boolean isMatch() {
		return match;
	}

	public void setMatch(boolean match) {
		this.match = match;
	}
	



}

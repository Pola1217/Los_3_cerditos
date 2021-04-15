package model;


import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Wolf extends Elements {
	
	public PApplet app;
	
	private PImage WOLF, WBLOW, WBURN;
	
	private int wolf;
	
	private boolean click, click2, click3;
	

	
	public Wolf (PApplet app, int X, int Y, int width, int height) {
		
		super(app, X, Y, height, width);
		
		this.app = app;
		
		WOLF = app.loadImage("data/Lobo1.PNG");
		WBLOW = app.loadImage("data/Lobo2.PNG");
		WBURN = app.loadImage("data/Lobo3.PNG");
		
		click = true;
		click2 = true;
		click3 = false;
		
	}
	
	public void draw () {
		
		if (click) {
				
			app.imageMode(PConstants.CENTER);
			app.image(WOLF, X, Y, width, height);
			app.imageMode(PConstants.CORNER);
			
			}
	}
	
	public void draw1 () {
		
		if (click2==true) {
		
		app.imageMode(PConstants.CENTER);
		app.image(WBLOW, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
		}
		
	}
	
	public void draw2 () {
		
		if (click3==true) {	
	
		
		app.imageMode(PConstants.CENTER);
		app.image(WBURN, X, Y, width, height);
		app.imageMode(PConstants.CORNER);
		
		
		
		}
	
		
	}
	
	

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public PImage getWOLF() {
		return WOLF;
	}

	public void setWOLF(PImage wOLF) {
		WOLF = wOLF;
	}

	public PImage getWBLOW() {
		return WBLOW;
	}

	public void setWBLOW(PImage wBLOW) {
		WBLOW = wBLOW;
	}

	public PImage getWBURN() {
		return WBURN;
	}

	public void setWBURN(PImage wBURN) {
		WBURN = wBURN;
	}

	public int getWolf() {
		return wolf;
	}

	public void setWolf(int wolf) {
		this.wolf = wolf;
	}

	public boolean isClick() {
		return click;
	}

	public void setClick(boolean click) {
		this.click = click;
	}

	public boolean isClick2() {
		return click2;
	}

	public void setClick2(boolean click2) {
		this.click2 = click2;
	}

	public boolean isClick3() {
		return click3;
	}

	public void setClick3(boolean click3) {
		this.click3 = click3;
	}

	
	
	
	
	}

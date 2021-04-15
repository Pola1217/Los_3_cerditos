package model;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Houses extends Elements{
	
	private PApplet app;
	
	private PImage wood, straw, brick;
	private PImage woodH, strawH, brickH;
	private PImage woodHF, strawHF, brickHF;
	
	
	private int houseW, houseS, houseB;
	
	public Houses (PApplet app, int X, int Y, int width, int height) {
		
		super(app, X, Y, width, height);
		
		this.app = app;
		
		//screen houses
		this.houseW = 0;
		this.houseS = 0;
		this.houseB = 0;
		
		wood = app.loadImage("data/Madera.PNG");
		straw = app.loadImage("data/Paja.PNG");
		brick = app.loadImage("data/Ladrillo.PNG");
		
		woodH = app.loadImage("data/CasaMadera1.PNG");
		strawH = app.loadImage("data/CasaPaja1.PNG");
		brickH = app.loadImage("data/CasaLadri1.PNG");
		
		woodHF = app.loadImage("data/CasaMadera2.PNG");
		strawHF = app.loadImage("data/CasaPaja2.PNG");
		brickHF = app.loadImage("data/CasaLadri2.PNG");
		
	}
	
	public void drawB () {
		
		this.app.imageMode(PConstants.CENTER);
		
		switch (houseB) {
		
		case 0:
			
			this.app.image(brick, X, Y, width, height);
			
			break;
		
		case 1:
			
			this.app.image(brickH, 284,570, 250, 250);
			
			break;
			
		case 2:
			
			this.app.image(brickHF, 384,570, 250, 250);
			
			break;
			
		}
		
		this.app.imageMode(PConstants.CORNER);
		
	}
	
	public void drawW () {
		
		this.app.imageMode(PConstants.CENTER);
		
		switch (houseW) {
		
		case 0:
			
			this.app.image(wood, X, Y, width, height);
			
			break;
		
		case 1:
			
			this.app.image(woodH, X, Y, width, height);
			
			break;
			
		case 2:
			
			this.app.image(woodHF, X, Y, width, height);
			
			break;
			
		}
		
		this.app.imageMode(PConstants.CORNER);
		
	}
	
	public void drawS () {
		
		this.app.imageMode(PConstants.CENTER);
		
		switch (houseS) {
		
		case 0:
			
			this.app.image(straw, X, Y, width, height);
			
			break;
		
		case 1:
			
			this.app.image(strawH, X, Y, width, height);
			
			break;
			
		case 2:
			
			this.app.image(strawHF, X, Y, width, height);
			
			break;
			
		}
		
		this.app.imageMode(PConstants.CORNER);
		
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

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

	public PImage getWoodH() {
		return woodH;
	}

	public void setWoodH(PImage woodH) {
		this.woodH = woodH;
	}

	public PImage getStrawH() {
		return strawH;
	}

	public void setStrawH(PImage strawH) {
		this.strawH = strawH;
	}

	public PImage getBrickH() {
		return brickH;
	}

	public void setBrickH(PImage brickH) {
		this.brickH = brickH;
	}

	public PImage getWoodHF() {
		return woodHF;
	}

	public void setWoodHF(PImage woodHF) {
		this.woodHF = woodHF;
	}

	public PImage getStrawHF() {
		return strawHF;
	}

	public void setStrawHF(PImage strawHF) {
		this.strawHF = strawHF;
	}

	public PImage getBrickHF() {
		return brickHF;
	}

	public void setBrickHF(PImage brickHF) {
		this.brickHF = brickHF;
	}

	public int getHouseW() {
		return houseW;
	}

	public void setHouseW(int houseW) {
		this.houseW = houseW;
	}

	public int getHouseS() {
		return houseS;
	}

	public void setHouseS(int houseS) {
		this.houseS = houseS;
	}

	public int getHouseB() {
		return houseB;
	}

	public void setHouseB(int houseB) {
		this.houseB = houseB;
	}

	
	
}

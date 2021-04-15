package controller;

import model.Logic;
import processing.core.PApplet;

public class controller {

	Logic logic;
	
	public controller (PApplet app) {
		
		logic = new Logic(app);
		
		logic.createtext(app);
		
	}
	
	public void draw () {
		
		logic.draw();
		
	}
	
	public void draw1 () {
		
		logic.draw1();
		
	}
	
	public void draw2 () {
		
		logic.draw3();
		
	}
	
	public void draw3 () {
		
		logic.draw2();
		
	}
	
	public void clicked () {
		
		logic.DmatchFire();
		
	}
	
	public void dragged () {
		
		logic.DmatchPigs();
		logic.DblowWolf();
		
	}
	
	public void Released () {
		
		logic.matchPigs();
		logic.matchFire();
		logic.blowWolf();
		
	}
	
}

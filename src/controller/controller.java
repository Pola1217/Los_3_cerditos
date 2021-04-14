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
	
	public void Dmatching () {
		
		logic.DmatchPigs();
		
	}
	
	public void matching() {
		
		logic.matchPigs();
		
	}
	
}

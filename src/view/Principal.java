package view;

import controller.controller;
import processing.core.PApplet;
//import processing.core.PConstants;
import processing.core.PImage;


public class Principal extends PApplet {

	public static void main(String[] args) {
		PApplet.main("view.Principal");
	}
	
	
	
	//screens images
	PImage START, STORY, MISION, GAME, GAMEND, FINISH;
	
	//parallax
	PImage BACKG;
	
	
	//pigs
	PImage bigP, bigP1;
	PImage mediP, mediP1;
	PImage smallP, smallP1;
	
	//materials
	
	PImage wood, woodH, straw, brick;
	
	//screen
	int screen = 0;
	
	//MVC
	controller controller;
	
	@Override
	public void settings() {
		
		size (1200, 900);
		
	}
	
	@Override
	public void setup() {
		
		controller = new controller(this);
		
		//screens
		START = loadImage ("data/INICIO.png");
		STORY = loadImage ("data/STORY.png");
		MISION = loadImage ("data/MISION.png");
		GAME = loadImage ("data/GAME.png");
		GAMEND = loadImage ("data/GAME-END.png");
		FINISH = loadImage ("data/END.png");
		
		//parallax
		BACKG = loadImage ("data/FONDO1-01.png");
		
//		//running
//		bigP = loadImage("data/Pig1.PNG");
//		//happy
//		bigP1 = loadImage("data/Pig1.1.PNG");
//		//materials
//		wood = loadImage("data/Madera.PNG");
//		woodH = loadImage("data/CasaMadera1.PNG");
	}
	
	@Override
	public void draw() {
		
		System.out.println(mouseX+","+mouseY);
		
		background (255);
		
		switch (screen) {
		
		case 0:
			
			image(START, 0, 0);
			
		break;
		
		case 1:
			
			image (STORY, 0, 0);
			
		break;
		
		case 2:
			
			image (MISION, 0, 0);
			
		break;
		
		case 3:
			
			//parallax
			float fgX=map(mouseX,0,width,0,0-900);
			image(BACKG,fgX+100,100,2482,683);
			
			image (GAME, 0, 0);
			
			controller.draw();
			
//			imageMode(PConstants.CENTER);
//			image(bigP1, 281,659, 190, 190);
//			imageMode(PConstants.CORNER);
			
			//273,708
			
		break;
		
		case 4:
			
			image (FINISH, 0, 0);
		
		break;
			
		
		
		}
		
	}
	
	@Override
	public void mousePressed() {
		
		switch (screen) {
		
		case 0://play
			if (dist(mouseX, mouseY, 582,762) < 50) {
				
				screen = 3;
				
			}
			
			
			break;
			
		case 1://story
			if (dist(mouseX, mouseY, 901,698) < 50) {
				
				screen = 2;
				
			}	
			
			else if(dist(mouseX, mouseY, 136,95) < 30) {
				
				screen = 0;
				
			}
			
			break;
			
		case 2://mision
			
			if (dist(mouseX, mouseY, 935,552) < 50) {
				
				screen = 3;
				
			}	
			
			else if(dist(mouseX, mouseY, 136,95) < 30) {
				
				screen = 1;
				
			}
			
			break;
			
		case 3://game
			
			if(dist(mouseX, mouseY, 72,58) < 30) {
				
				screen = 2;
				
			}	
			
			
			
			break;
			
			
		case 4://end
			
			if (dist(mouseX, mouseY, 136,95) < 30) {
				
				screen = 1;
				
			}	
		
			}
			
	}
	
	public void mouseDragged () {
		
		controller.Dmatching();
		
	}
	
public void mouseReleased () {
		
		controller.matching();
		
	}
		
}
	
	

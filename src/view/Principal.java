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
	PImage START, STORY, MISION, GAME, GAME1, GAME2, GAME3, GAMEND, FINISH;
	
	//parallax
	PImage BACKG, BACKG1;
	
	
	//pigs
	PImage bigP, bigP1;
	PImage mediP, mediP1;
	PImage smallP, smallP1;
	
	//materials
	
	PImage wood, woodH, straw, brick;
	
	//screen
	int screen = 3;
	
	//MVC
	controller controller;
	
	@Override
	public void settings() {
		
		size (1200, 900);
		
	}
	
	@Override
	public void setup() {
		
		controller = new controller(this);
		
		//screens context
		START = loadImage ("data/INICIO.png");
		STORY = loadImage ("data/STORY.png");
		MISION = loadImage ("data/MISION.png");
		
		//screens game
		GAME = loadImage ("data/GAME.png");
		GAME1 = loadImage ("data/GAME1.png");
		GAME2 = loadImage ("data/GAME2.png");
		GAME3 = loadImage ("data/GAME3.png");
		
		//end
		FINISH = loadImage ("data/END.png");
		
		//parallax
		BACKG = loadImage ("data/FONDO1.1-02.png");
		BACKG1 = loadImage ("data/FONDO1-01.png");
		
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
			
			float dgX=map(mouseX,0,width,0,0-900);
			image(BACKG1,dgX+100,100,2482,683);
			
			image (GAME1, 0, 0);
			
			controller.draw1();
		
		break;
			
		case 5:
			
			float f1gX=map(mouseX,0,width,0,0-900);
			image(BACKG,f1gX+100,100,2482,683);
			
			image (GAME2, 0, 0);
			
			controller.draw2();
		
		break;
		
		case 6:
			
			image (GAME3, 0, 0);
			
			controller.draw3();
		
		break;
		
		case 7:
			
			image (FINISH, 0, 0);
		
		break;
		
		}
		
	}
	
	@Override
	public void mousePressed() {
		
		switch (screen) {
		
		case 0://play
			if (dist(mouseX, mouseY, 582,762) < 50) {
				
				screen = 1;
				
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
				
			} else if (dist(mouseX, mouseY, 615,847) < 30)	{
				
				screen = 4;
				
			}
			
			break;
			
			
		case 4:
			
			
			
			if (dist(mouseX, mouseY, 615,847) < 30) {
				
				screen = 5;
				
			}	
			
			break;
			
		case 5:
			
			controller.clicked();
			
			
			if (dist(mouseX, mouseY, 615,847) < 30) {
				
				screen = 6;
				
			}	

			break;
			
		case 6:
			
			if (dist(mouseX, mouseY, 615,847) < 30) {
				
				screen = 7;
				
			}	

			break;	
			
		case 7:
			
			if (dist(mouseX, mouseY, 144,74) < 30) {
				
				exit();
				
			}	

			break;		
		
			}
			
	}
	
	public void mouseDragged () {
		
		controller.dragged();
		
	}
	
public void mouseReleased () {
		
	controller.Released();
		
	}
		
}
	
	

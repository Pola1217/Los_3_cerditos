package model;

import java.util.ArrayList;

//import Materials;
//import Pigs;
import processing.core.PApplet;

public class Logic {

	
	//
	public PApplet app;
	
	//text
	private String[] text;
	private String[] lines;
	
	//arraywords
	private ArrayList <String> words;
	
	//class
	
	//class
	private Pigs pigB;
	private Pigs pigM , pigM1;
	private Pigs pigS , pigS1;
	
	private Wolf wolf, wolf1;
	
	private Fireplace fire;
	
	private Houses strawH, strawH1, woodH, woodH1, brickH;
	
	
	public Logic (PApplet app) {
		
		this.app = app;
		
		words = new ArrayList<>();
		
		//wolf
		wolf = new Wolf(app, 284,627, 300, 300);
		wolf1 = new Wolf(app, 620,407, 430, 430);
		
		//fire
		fire = new Fireplace (app, 620,567, 350, 370);
		
		//big pig
		//happy
		pigB = new Pigs(app, 413,702, 190, 190);
		//scare
		//pigB1 = new Pigs(app, 250, 659, 190, 190);

		//medium pig
		//happy
		pigM = new Pigs(app, 614,702, 190, 190);
		//scare
		pigM1 = new Pigs(app, 895, 630, 150, 150);
		
		//small pig
		//happy
		pigS = new Pigs(app, 823,707, 190, 190);
		//scare
		pigS1 = new Pigs(app, 985, 659, 150, 150);
		
		
		
		//houses
		brickH = new Houses (app, 284,627, 220, 220);
		
		woodH = new Houses (app, 614,480, 270, 270);
		woodH1 = new Houses (app, 614,510, 320, 320);
		
		strawH = new Houses (app, 984,628, 270, 270);
		strawH1 = new Houses (app, 614,510, 320, 320);
		
		
	}
	
	public void createtext(PApplet app) {
		
		text = app.loadStrings("texto/texto.txt");
		
		for (int i = 0; i < text.length; i++) {
			
			lines = PApplet.split(text[i]," ");
		
		for (int j = 0; j < lines.length; j++) {
			
			words.add(lines[j]);
			
		}
	
		}
	}
	
	public void draw () {
		
		//houses
		brickH.drawB();
		woodH.drawW();
		strawH.drawS();
		
		//wolf
		
		
		//piggys
		//big
		pigB.drawBig();
		//medium
		pigM.drawMedium();
		//small
		pigS.drawSmall();
		
	}
	
	public void draw1 () {
		
		strawH1.drawS();
		strawH1.setHouseS(1);
		
		//wolf
		wolf.draw1();
		
		//piggys
		//small
		pigS1.drawSmall1();
		
	}
	
	public void draw3 () {
		
		//wolf
		woodH1.drawW();
		woodH1.setHouseW(1);
		//wolf
		wolf.draw1();
		
		//piggys
		pigS1.drawSmall1();
		pigM1.drawMedium1();
		
	}
	
	public void draw2 () {
		
		//fire
		fire.draw();
				
		//wolf
		wolf1.draw2();
		
	}
	
	public void DmatchPigs () {
		
		//big pig - house
		if (PApplet.dist(app.mouseX, app.mouseY, pigB.getX(), pigB.getY()) < pigB.getWidth()/2) {
					
			pigB.setX(app.mouseX);
			pigB.setY(app.mouseY);
					
		}
		
		//medium pig - house
		if (PApplet.dist(app.mouseX, app.mouseY, pigM.getX(), pigM.getY()) < pigM.getWidth()/2) {
			
			pigM.setX(app.mouseX);
			pigM.setY(app.mouseY);
			
		}
		
		//small pig - house
		if (PApplet.dist(app.mouseX, app.mouseY, pigS.getX(), pigS.getY()) < pigS.getWidth()/2) {
					
			pigS.setX(app.mouseX);
			pigS.setY(app.mouseY);
					
		}
		
	}
	
	public void matchPigs () {
		
//		if (brick == null){
//			
//			System.out.print("es nulo mija");
//		}
//		else if (pigB == null) {
//			System.out.print("es nulo mijita");
			
		//big pig 
		if (PApplet.dist (brickH.getX(), brickH.getY(), pigB.getX(), pigB.getY()) < brickH.getWidth()/2) {
			
			brickH.setHouseB(1);
			pigB.setMatch(true);
			
		
		}
	//}
		//medium pig
		if (PApplet.dist(woodH.getX(), woodH.getY(), pigM.getX(), pigM.getY())< woodH.getWidth()/2) {
			
			woodH.setHouseW(1);
			pigM.setMatch(true);
		
		}
		
		//small pig
		if (PApplet.dist(strawH.getX(), strawH.getY(), pigS.getX(), pigS.getY()) < strawH.getWidth()/2) {
			
			strawH.setHouseS(1);
			pigS.setMatch(true);
			
		}		
	}

	public void DmatchFire () {
				
		if (PApplet.dist(app.mouseX, app.mouseY, fire.getX(), fire.getY()) < fire.getWidth()/2) {
			
			fire.setMatch(true);
		
		}
	}
	
	public void matchFire () {
		
		if (PApplet.dist (fire.getX(), fire.getY(), 620,567) < fire.getWidth()/2 ) {
			
			wolf1.setClick3(true);
			fire.setMatch(true);
		
		}
	}
	
	public void DblowWolf () {
		
		if (PApplet.dist(app.mouseX, app.mouseY, wolf.getX(), wolf.getY()) < wolf.getWidth()/2 ) {
			
			wolf.setX(app.mouseX);
			wolf.setY(app.mouseY);
			
		}
	}
	
	public void blowWolf () {
		
		if (PApplet.dist(strawH1.getX(), strawH1.getY(), wolf.getX(), wolf.getY()) < strawH1.getWidth()/2 && strawH1.getHouseS() == 1) {
			
			strawH1.setHouseS(2);
			wolf.setClick2(true);
			
			
		}
		
		if (PApplet.dist(woodH1.getX(), woodH1.getY(), wolf.getX(), wolf.getY()) < woodH1.getWidth()/2 && woodH1.getHouseW() == 1) {
			
			woodH1.setHouseW(2);
			wolf.setClick2(true);
			
			
		}
		
	}
	
}
	


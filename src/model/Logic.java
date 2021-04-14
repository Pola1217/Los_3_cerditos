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
	private Pigs pigB , pigB1;
	private Pigs pigM , pigM1;
	private Pigs pigS , pigS1;
	
	
	private Materials wood, straw, brick;
	private Houses strawH, woodH, brickH;
	
	
	public Logic (PApplet app) {
		
		this.app = app;
		
		words = new ArrayList<>();
		
		//wolf
		
		
		//materials
		brick = new Materials (app, 284,627, 190, 190);
		wood = new Materials (app, 614,570, 190, 190);
		straw = new Materials (app, 904,628, 190, 19);
		
		//big pig
		//happy
		pigB = new Pigs(app, 413,702, 190, 190);
		//scare
		pigB1 = new Pigs(app, 250, 659, 190, 190);

		//medium pig
		//happy
		pigM = new Pigs(app, 614,702, 190, 190);
		//scare
		pigM1 = new Pigs(app, 250, 659, 190, 190);
		
		//small pig
		//happy
		pigS = new Pigs(app, 734,702, 190, 190);
		//scare
		pigS1 = new Pigs(app, 250, 659, 190, 190);
		
		
		
		//houses
		brickH = new Houses (app);
		woodH = new Houses (app);
		strawH = new Houses (app);
		
		
		
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
		
		//materials
		brick.drawB();
		wood.drawW();
		straw.drawS();
		
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
		if (PApplet.dist (brick.getX(), brick.getY(), pigB.getX(), pigB.getY()) < brick.getWidth()/2) {
			
			brickH.setHouseB(1);
			pigB.setMatch(true);
			
		
		}
	//}
		//medium pig
		if (PApplet.dist(wood.getX(), wood.getY(), pigM.getX(), pigM.getY())< wood.getWidth()/2) {
			
			woodH.setHouseW(1);
			pigM.setMatch(true);
		
		}
		
		//small pig
		if (PApplet.dist(straw.getX(), straw.getY(), pigS.getX(), pigS.getY()) < straw.getWidth()/2) {
			
			strawH.setHouseS(1);
			pigS.setMatch(true);
			
		}		
	}
	
	public void blowWolf () {
		
		if (PApplet.dist(app.mouseX, app.mouseY, pigB.getX(), pigB.getY()) < pigB.getWidth()/2) {
			
			pigB.setX(app.mouseX);
			pigB.setY(app.mouseY);
					
		}
		
	}
	
}
	


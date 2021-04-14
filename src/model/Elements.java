package model;

import processing.core.PApplet;

public abstract class Elements {
	
	int X, Y, height, width;
	
	public Elements (PApplet app, int X, int Y, int height, int width) {
		
		this.X = X;
		this.Y = Y;
		this.height = height;
		this.width = width;
				
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	
}

package model;

import processing.core.PApplet;

public class Circle extends Figure{

	public Circle (int x, int y, PApplet app) {
		super (x,y,app);		
	}

	protected void paintObject() {
		ellipse(0, 0, getX(), getY());		
	}
}

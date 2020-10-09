package model;

import processing.core.PApplet;

public class Circle extends Figure{
	public float radius;
	public Circle (int x, int y, float radius, PApplet app) {
		super (x,y,app);
		this.radius=radius;
	}

	protected void paintObject() {
		 ellipse(getX(), getY(), radius, radius);	
	}
}


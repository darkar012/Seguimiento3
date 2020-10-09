package model;

import processing.core.PApplet;

public class Circle extends Figure{

	public Circle (int x, int y, float change, PApplet app) {
		super (x,y,change, app);
	}

	protected void paintObject(int x, int y, float change) {
		app.ellipse(x, y, change, change);
		if(change >= 1) {
			change *= 0.75f;
			paintObject(x, y, change);
		}
	}
}



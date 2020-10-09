package model;

import processing.core.PApplet;

public class CircleButton extends Button{

	public CircleButton(PApplet app) {
		super(app);
		button = app.loadImage("../images/circle.png");
	}

	protected void PaintButton() {
		app.image(button, 0, 0);

	}
}

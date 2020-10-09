package model;

import processing.core.PApplet;

public class SquareButton extends Button {

	public SquareButton(PApplet app) {
		super(app);
		button = app.loadImage("../images/square.png");
	}

	protected void PaintButton() {
		app.image(button, 0, 90);

	}
}
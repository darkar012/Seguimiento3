package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Button extends PApplet{
	PApplet app;
	PImage button;
	
	public Button (PApplet app) {
		this.app = app;
	}
	protected abstract void PaintButton();
}

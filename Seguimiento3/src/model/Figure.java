package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet{
	protected int x;
	protected int y;
	protected float change;
	PApplet app;

	public Figure(int x, int y, float change, PApplet app) {
		this.x = x;
		this.y = y;
		this.app = app;
		this.change = change;
	}

	protected abstract void paintObject(int x, int y, float change);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


}

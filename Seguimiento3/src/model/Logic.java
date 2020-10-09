package model;

import processing.core.PApplet;

public class Logic extends PApplet{
PApplet app;
Circle circle;
public int x;
public int y;
public int n;
	public Logic (PApplet app) {
		this.app = app;
		circle = new Circle(x, y, n, this);
	}
		public void paintCircle() {
			 circle.paintObject();
			  if(n < 1) {
			    n *= 0.75f;
			    circle.paintObject();
		}
	}
}


package model;

import processing.core.PApplet;

public class Square extends Figure {

		public Square(int x, int y, float change, PApplet app) {
		super(x, y, change, app);

	}

		protected void paintObject(int x, int y, float change) {
			app.rectMode(CENTER); 
			app.rect(x, y, change, change);
			 if(change >= 1) {
	 		    change *= 0.75f;
	 		   paintObject(x, y, change);
		}
		}
	}

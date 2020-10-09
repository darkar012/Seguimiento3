package model;

import processing.core.PApplet;

public class Square extends Figure implements Rotatable{

	public Square(int x, int y, float change, PApplet app) {
		super(x, y, change, app);
	}

	protected void paintObject(int x, int y, float change) {
		/*twist(450, 400, 0, 12, change);
		if(change >= 1) {
			change *= 0.75f;
			paintObject(x, y, change);
			//twist(x, y, change);*/
		}


	public void twist(int x, int y, int count, int rot, float change) {
		app.rectMode(CENTER);
        if(count%2==0) {
        app.rotate(PI/rot);
        app.rect(x, y, change, change);
        app.rotate(PI/-rot);        
           }else {
        app.rect(x, y, change, change);
     }
        count= count+1;
        
        if(change >= 1) {
			change *= 0.75f;
			twist(x, y, count, rot, change);
	}
	}
}


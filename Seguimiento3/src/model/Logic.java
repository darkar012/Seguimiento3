package model;

import processing.core.PApplet;

public class Logic extends PApplet{


public static void main(String[] args) {
	// TODO Auto-generated method stub
	PApplet.main(Logic.class.getName());
}

PApplet app;
Figure circle;
Figure square;
Button circleButton;
Button squareButton;
public int x;
public int y;
public int n;
public int state;

    public void settings() {
        size(800,800);
    }

    public void setup() {
    	state= 0;
    	n = 50;
        circle = new Circle(250, 250 , 200, this);
        square = new Square(400, 400, 200, this);
        circleButton = new CircleButton(this);
        squareButton = new SquareButton(this);
    }

    public void draw() {
        background (255);
        circleButton.PaintButton();
        squareButton.PaintButton();
        switch (state) {
        case 1:
        	circle.paintObject(450, 400, 550);
        	break;
        case 2:
        	square.paintObject(450, 400, 500);
        		  }
        System.out.println(state);
}

    public void mouseClicked() {
    	if (mouseX > 0 && mouseX < 0 + 85
				&& mouseY > 0 && mouseY < 0 +85 ) {
			state = 1;
		}
    	if (mouseX > 0 && mouseX < 0 + 139
				&& mouseY > 90 && mouseY < 90 +85 ) {
    		state = 2;
    	}
    }



}



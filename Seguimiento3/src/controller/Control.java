package controller;

import model.Logic;
import processing.core.PApplet;

public class Control {

		public Logic logic;
		PApplet app;
		
		public Control (PApplet app) {
			this.app = app;
			logic = new Logic (app);
}
		public void paintCircle(){
			logic.paintCircle();
		}
}

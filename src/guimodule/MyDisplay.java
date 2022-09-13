package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	public void setup() {
		size(400,400);
		fill(200,200,200);
	}
	public void draw() {
		fill(255,255,0);
		ellipse(200,200,350,350);
		fill(0,0,0);
		ellipse(120,150,50,50);
		ellipse(280,150,50,50);
		
//		noFill();
		arc(200, 260, 110, 110, 0, PI);
		
	}
}

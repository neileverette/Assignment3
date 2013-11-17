import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.event.*;

public class dragCircle extends GraphicsProgram{
	
	private static final int NUM_CIRCLES = 10;
	
	// Instance variables
	private GLabel label;
	private makeBall ball1;
	
	public void init(){
		
		createCircle();
		createRandomCircles();
		trackMouse();
				
		addMouseListeners();
	}
	
	private GOval randomCircle(int x, int y, int r, Color color){ 
		GOval circle = new GOval(x,y,2*r,2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	
	private void createCircle(){
		ball1 = new makeBall("A", 30);
		ball1.setColor(Color.BLACK);
		add(ball1, 100, 100);
	}
	
	private void createRandomCircles(){
		
		// Create random Circles
		for (int i = 0; i < NUM_CIRCLES; i++){
			
			// Variables
			int r = rgen.nextInt(5, 50);
			
			int x = rgen.nextInt(0, getWidth()- 2*r);
			int y = rgen.nextInt(0, getHeight()- 2*r);
			
			add(randomCircle(x, y, r, rgen.nextColor()));
		}
		
	}
	
	private void trackMouse(){
		label = new GLabel("no mouse detected");
		label.setFont("Helvetica-20"); 
		add(label, getWidth()/2 - label.getWidth()/2, label.getHeight());
	}

	public void mouseMoved(MouseEvent e){
		label.setLocation(getWidth()/2 - label.getWidth()/2, label.getHeight());
		label.setLabel(e.getX() + " " + e.getY());
		
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}

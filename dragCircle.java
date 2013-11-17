import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.event.*;

public class dragCircle extends GraphicsProgram{
	
	private static final int BALLS = 1;
	
	// Instance variables
	private GLabel label;
	private makeBall ball1;
	
	public void init(){
		
		// Variables
		double y = rgen.nextDouble(0, 10);
		int r = rgen.nextInt(5, 50);
		int x = rgen.nextInt(0, 10);
		
		createCircles();
		trackMouse();
		addMouseListeners();
	}
	
	private void createCircles(){
		ball1 = new makeBall("A", 30);
		ball1.setColor(Color.BLACK);
		add(ball1, 100, 100);
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

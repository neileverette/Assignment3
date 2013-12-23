import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.event.*;

public class dragCircle extends GraphicsProgram{
	
	private static final int NUM_CIRCLES = 5;
	
	// Instance variables
	private GLabel label;
	private makeBall ball1;
	private GPoint last;
	private GObject gobj;
	private Color lastColor;

	
	public void init(){
		
		createCircle();
		createRandomCircles();
		createRect(100,100,50);
		trackMouse();
				
		addMouseListeners();
	}
	
	private GOval randomCircle(int x, int y, int r, Color color){ 
		GOval circle = new GOval(x,y,2*r,2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	
	private GRect createRect(double x, double y, double s){
		GRect square = new GRect(x,y,s,s);
		square.setFilled(true);
		square.setColor(Color.GREEN);
		add(square);
		return square;
	}
	
	// Creates Circle from an external class
	private void createCircle(){
		ball1 = new makeBall("A", 30);
		ball1.setColor(Color.BLACK);
		add(ball1, 100, 100);
	}
	

	// Method that makes random circles that appear within the window
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
		
		if(e != null){
			label.setLabel(e.getX() + " " + e.getY());
		}else{
			label.setLabel("no mouse detected");
		}
	}
	
	public void mousePressed(MouseEvent e){
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
		lastColor = gobj.getColor();
		//gobj.setVisible(false);
		gobj.setColor(Color.GREEN);
		gobj.sendToFront();
	}
	
	public void mouseReleased(MouseEvent e){
		gobj.setColor(lastColor);
		gobj.setVisible(true);
	}
	
	public void mouseDragged(MouseEvent e){
	
		if (gobj != null){
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}

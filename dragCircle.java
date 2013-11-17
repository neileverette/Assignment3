import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class dragCircle extends GraphicsProgram{
	
	private static final int BALLS = 1;
	
	// Instance variables
	private GLabel label;
	private makeBall ball1;
	
	public void init(){
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

}

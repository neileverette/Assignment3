import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class dragCircle extends GraphicsProgram{
	
	// Instance variables
	
	
	public void init(){
		createCircles();
		trackMouse();
		
		addMouseListeners();
	}
	
	private void createCircles(){
		
	}
	
	private void trackMouse(){
		GLabel label = new GLabel("no mouse detected");
		label.setFont("Helvetica - 18");
		add(label);
		
	}

}

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;


public class moveCircle extends GraphicsProgram{
	
	// Constants
	private static final double DIAM = 30;
	private static final double X_DIMIN = DIAM/2;
	private static final double Y_DIMIN = DIAM/2;
	
	private GOval ball;
	
	
	public void run(){
		
		createCircle();
		makeBall(X_DIMIN,100,30);
		
	}
	
	// Method that uses an instance variable
	private void createCircle(){
		ball = new GOval (X_DIMIN, Y_DIMIN, DIAM, DIAM);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
		add(ball);
	}
	
	// Method that returns a GObject
	public GOval makeBall(double x, double y, double r){
		GOval circle = new GOval(x,y,r,r);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle);
		return circle;
	
	}
}
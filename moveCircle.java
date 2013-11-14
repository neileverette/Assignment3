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
		
		createBall(X_DIMIN, Y_DIMIN, DIAM, DIAM);
		
	}
	
	// This method creates the ball
	private void createBall(double x, double y, double r){
		ball = new GOval (x,y,r,r);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
		add(ball);
	}
}
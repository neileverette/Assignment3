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
		
		createBall();
		
	}
	
	// This method creates the ball
	private void createBall(){
		ball = new GOval (X_DIMIN, Y_DIMIN, DIAM, DIAM);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
		add(ball);
	}
}
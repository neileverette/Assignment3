import java.awt.Color;

import acm.graphics.*;
import acm.program.*;


public class moveCircle extends GraphicsProgram{
	
	// Constants
	private static final double DIAM = 30;
	private static final double X_DIMIN = 0 + DIAM/2;
	private static final double Y_DIMIN = 0 + DIAM/2;
	
	private GOval ball;
	
	public void run(){
		
		createBall(X_DIMIN, Y_DIMIN, DIAM);
		
	}
	
	private void createBall(double x, double y, double d){
		ball = new GOval(x, y, d, d);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
		add(ball);
		
	}
	
}
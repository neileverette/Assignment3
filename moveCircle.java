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
		

		
		
	}
	
	private void createBall(int x, int y, int d){
		ball = new GOval(x,y,d,d);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
		add(add);
		
	}
	
}
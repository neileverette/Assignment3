import acm.graphics.*;
import acm.program.*;


public class moveCircle extends GraphicsProgram{
	
	// Constants
	private static final double DIAM = 30;
	private static final double X_DIMIN = 0 + DIAM/2;
	private static final double Y_DIMIN = 0 + DIAM/2;
	
	// Instance variable
	createBall newBall = new createBall(X_DIMIN,Y_DIMIN, DIAM, DIAM);
	add(newBall);
	
	public void run(){
		
	}

}

import acm.graphics.*;
import acm.program.*;


public class moveCircle extends GraphicsProgram{
	
	// Constants
	private static final double DIAM = 30;
	private static final double X_DIMIN = 0 + DIAM/2;
	private static final double Y_DIMIN = 0 + DIAM/2;
	
	// Instance variable
	private GOval ball;
	
	public void run(){
		
		
	}
	
	private GOval createBall(double x, double y, double d, double d){
		ball = new GOval(x,y,d,d);
	}

}

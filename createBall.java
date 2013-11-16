import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;


public class createBall extends GCompound {
	

	// Takes no parameters
	public createBall(double x, double y, double r){
		newCircle = new GOval(r, r);
		newCircle.setFilled(true);
		newCircle.setFillColor(Color.YELLOW);
		add(newCircle);
	}

	private GOval newCircle;
	
}


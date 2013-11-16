import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;


public class createBall extends GraphicsProgram{
	

	// Takes no parameters
	public createBall(double r){
		newCircle = new GOval(r, r);
		newCircle.setFilled(true);
		add(newCircle,0,0);
	}

	private GOval newCircle;
	
}


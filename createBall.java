import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;


public class createBall extends GraphicsProgram{
	
	private GOval newCircle;
	
	// Takes no parameters
	public createBall(double r){
		newCircle = new GOval(r, r);
		newCircle.setFilled(true);
		newCircle.setFillColor(Color.BLACK);
		add(newCircle,0,0);
	}

}


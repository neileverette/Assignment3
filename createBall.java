import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;


public class createBall extends GraphicsProgram{
	
	private GOval newCircle;
	
	// Takes no parameters
	public createBall(double x, double y){
		newCircle = new GOval(x, y);
		newCircle.setFilled(true);
		newCircle.setFillColor(Color.YELLOW);
		add(newCircle);
	}

}


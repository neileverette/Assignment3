import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;

//import acm.graphics.GOval;


public class createBall extends GraphicsProgram{
	
	private GOval newCircle;
	
	// Takes no parameters
	public createBall(){
		newCircle = new GOval(100, 300, 30,30);
		newCircle.setFilled(true);
		newCircle.setFillColor(Color.YELLOW);
		add(newCircle);
	}

}


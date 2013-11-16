import java.awt.Color;
import acm.graphics.*;

//import acm.graphics.GOval;


public class createBall {
	
	// Takes no parameters
	public createBall(){
		GOval newCircle = new GOval(100, 200, 30,30);
		newCircle.setFilled(true);
		newCircle.setFillColor(Color.YELLOW);
	}

}


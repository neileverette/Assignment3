import java.awt.Color;
import acm.graphics.*;

//import acm.graphics.GOval;


public class createBall {
	
	// this method takes no parameters
	public createBall(){

	}
	
	private GOval newCircle(double x, double y, double r){
		GOval newCircle = new GOval(x,y,r,r);
		newCircle.setFilled(true);
		newCircle.setFillColor(Color.YELLOW);
		return newCircle;

	}

}


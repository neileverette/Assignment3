import java.awt.Color;
import acm.graphics.*;

//import acm.graphics.GOval;


public class createBall {
	
	// this method takes no parameters
	public createBall(){
		GOval newCircle = new GOval(50,200,30,30);
		newCircle.setFilled(true);
		newCircle.setColor(Color.YELLOW);
		add(newCircle);
	}

}


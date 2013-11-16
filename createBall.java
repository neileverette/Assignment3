import java.awt.Color;
import acm.graphics.*;

//import acm.graphics.GOval;


public class createBall {
	
	private GOval newCircle ;
	
	// Takes no parameters
	public createBall(){
		newCircle = new GOval(100, 200, 30,30);
		add(newCircle);
	}

}


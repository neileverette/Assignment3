import java.awt.Color;
import acm.graphics.*;

//import acm.graphics.GOval;


public class createBall {

	private double x;
	private double y;
	private double d;
	private GOval ball;	


	public GOval createBall(double x, double y, double d){
		this.x = x;
		this.y = y;
		this.d = d;
		
		ball = new GOval(x,y,d,d);
		ball.setFilled(true);
		ball.setFillColor(Color.BLACK);
		return ball;
	}
}

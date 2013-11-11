import java.awt.Color;
import acm.graphics.*;

import acm.graphics.GOval;


public class createBall {
	
	public createBall(double x, double y, double xPos, double yPos){
		this.x = x;
		this.y = y;
		this.xPos = xPos;
		this.yPos = yPos;
		
		ball = new GOval(x,y,xPos,yPos);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
		add(ball);
		return ball;		
	}

	
	private double x;
	private double y;
	private double xPos;
	private double yPos;
	private GRect ball;

}

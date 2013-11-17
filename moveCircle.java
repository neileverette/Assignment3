import java.awt.Color;
import acm.graphics.*;
import acm.program.*;


public class moveCircle extends GraphicsProgram{
	
	// Constants
	private static final double DIAM = 30;
	private static final double X_DIMIN = DIAM/2;
	private static final double Y_DIMIN = DIAM/2;
	
	private GOval ball;
	private createBall ball3;
	private createBall ball4;
	private createBall mouseBall;
	
	
	public void run(){
		
		createCircle();
		makeBall(X_DIMIN,100,30);
		
		createBall ball = new createBall(50);
		add(ball, X_DIMIN, 200);	
		
		createBall ball2 = new createBall();
		add(ball2, X_DIMIN, 300);	
		
		ball3 = new createBall(70);
		add(ball3, 200, 200);
		
		ball4 = new createBall(300,200,30,Color.ORANGE);
		add(ball4);
		
		mouseBall = new createBall(400,200,30,Color.GRAY);
		add(mouseBall);
	}
	
	// Method that uses an instance variable
	private void createCircle(){
		ball = new GOval (X_DIMIN, Y_DIMIN, DIAM, DIAM);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
		add(ball);
	}
	
	// Method that returns a GObject
	public GOval makeBall(double x, double y, double r){
		GOval circle = new GOval(x,y,r,r);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle);
		return circle;
	
	}
}
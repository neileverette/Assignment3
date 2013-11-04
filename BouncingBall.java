import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;


public class BouncingBall extends GraphicsProgram{
	
	private static final int BALL_RADIUS = 20;
	private static final double VELOCITY = 33;
	private static final double GRAVITY = 3;
	private static final double DELAY = 50;
	private static final double X_START = BALL_RADIUS;
	private static final double Y_START = 10;
	private static final double X_VEL=5;
	private static final double BOUNCE_REDUCE = 0.9;
	
	private double xVel = X_VEL;
	private double yVel = 0.0;
	
	private GOval bouncingBall;
	
	public void run(){
		createBall(X_START,Y_START);
		
		while(bouncingBall.getX() < getWidth()){
			moveBall();
	//		checkForCollision();
			pause(DELAY);
			
		}	
	}
	
	private void createBall(double x, double y){
		bouncingBall = new GOval(x,y, 2*BALL_RADIUS,2*BALL_RADIUS);
		bouncingBall.setFilled(true);
		bouncingBall.setColor(Color.BLACK);
		add(bouncingBall);
	}

	private void moveBall(){
		yVel += GRAVITY;
		bouncingBall.move(X_VEL, yVel);
	}
	
	private void checkForCollision(){
		if (bouncingBall.getY() > getHeight() - 2*BALL_RADIUS);{
			yVel = -yVel*BOUNCE_REDUCE;
		}
		
	}
}

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
	
	private GOval bouncingBall;
	
	public void run(){
		createBall(X_START,Y_START);
		
		
	}
	
	private void createBall(double x, double y){
		bouncingBall = new GOval(x,y, 2*BALL_RADIUS,2*BALL_RADIUS);
		bouncingBall.setFilled(true);
		bouncingBall.setColor(Color.BLACK);
		add(bouncingBall);
	}

	private void animateBall(){
		
		double velocity = VELOCITY;
		
		while(bouncingBall.getX() < getWidth()-2*BALL_RADIUS){
			moveBall(velocity);
			pause(10);
			velocity = .95*velocity;
			
		}
	}
	
	private void moveBall(double x){
		bouncingBall.setLocation(bouncingBall.getX() + x, bouncingBall.getY());
	}
}

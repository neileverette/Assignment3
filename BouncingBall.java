import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;


public class BouncingBall extends GraphicsProgram{
	
	private static final int BALL_RADIUS = 20;
	private static final double VELOCITY = 3;
	
	private GOval bouncingBall;
	
	public void run(){
		createBall(-BALL_RADIUS,100);
		animateBall();
		
	}
	
	private void createBall(int x, int y){
		bouncingBall = new GOval(x,y, 2*BALL_RADIUS,2*BALL_RADIUS);
		bouncingBall.setFilled(true);
		bouncingBall.setColor(Color.BLACK);
		add(bouncingBall);
	}

	private void animateBall(){
		while(bouncingBall.getX() < getWidth()){
			moveBall();
			pause(10);
			
		}
	}
	
	private void moveBall(){
		bouncingBall.setLocation(bouncingBall.getX() + .9*VELOCITY, bouncingBall.getY());
	}
}

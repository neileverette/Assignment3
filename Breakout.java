/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;
	
/** Paddle Speed */
	private static final double PADDLE_SPEED = 1;

	
	// Private instance variable for paddle
	private GRect paddle;
	
	// Private instance variable for ball
	private GOval ball;
	
	// Private instance variable for ball velocity
	private double vx,vy;
	
	
/** Runs the Breakout program. */
	public void run() {
		// Listener for keyboard events
		addKeyListeners();
		
		// Listener for mouse
		addMouseListeners();
		
		gameSetup();
		
		}
	
	// Sets up the game
	private void gameSetup(){
		createBricks();
		createPaddle();
		createBall();
	}
	
	// Loads the Bricks
	private void createBricks(){
		
		for (int i = 0; i < NBRICKS_PER_ROW; i++){
			
			for(int j = 0; j < NBRICK_ROWS; j++ ){
				GRect brick = new GRect(j*(BRICK_WIDTH + BRICK_SEP) + BRICK_SEP/2,i*(BRICK_HEIGHT + BRICK_SEP) + BRICK_Y_OFFSET, BRICK_WIDTH, BRICK_HEIGHT );
				brick.setFilled(true);
				
				// Set the color of the bricks
				if(i < 2){
					brick.setColor(Color.RED);
				}else if(i > 1 && i < 4){
					brick.setColor(Color.ORANGE);
				}else if(i > 3 && i < 6){
					brick.setColor(Color.YELLOW);
				}else if(i > 5 && i < 8){
					brick.setColor(Color.GREEN);
				}else{
					brick.setColor(Color.CYAN);
				}
				add(brick);
			}
		}
	}
	
	// Paddle
	private void createPaddle(){
		
		// Set the initial placement of the paddle
		int paddleX = getWidth()/2 - PADDLE_WIDTH/2;
		int paddleY = getHeight()-PADDLE_HEIGHT-PADDLE_Y_OFFSET;
		
		paddle = new GRect(paddleX, paddleY,PADDLE_WIDTH, PADDLE_HEIGHT );
		paddle.setFilled(true);
		paddle.setColor(Color.GRAY);
		add(paddle);

	}
 	
	// Arrow Paddle
	public void keyPressed(KeyEvent e) {

		
	    if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
	        // Right Arrow key   
	    	paddle.setLocation(paddle.getX() + PADDLE_SPEED, paddle.getY());

	    	
	    } else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
	        //Left arrow key
	    	paddle.setLocation(paddle.getX() - PADDLE_SPEED, paddle.getY());
	    }  
	}
	
	// This method is called everytime user moves mouse 
 	public void mouseMoved(MouseEvent e) { 
		
		if(e.getX() < getWidth()-PADDLE_WIDTH/2 && e.getX() > PADDLE_WIDTH/2){
			paddle.setLocation(e.getX()-PADDLE_WIDTH/2, paddle.getY());
		}
			
	 }

	
	// This method creates the ball
	private void createBall(){
		ball = new GOval (getWidth()/2-BALL_RADIUS,getWidth()/2,BALL_RADIUS*2,BALL_RADIUS*2);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
		add(ball);
	}
	
	
}

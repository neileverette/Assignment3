import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.event.*;
import java.awt.Canvas;
import java.awt.Color;


public class tuner_circle extends GraphicsProgram{
	
	
	// Sets the number of "days" of the photos
	private static final int PHOTO_DAYS = 700;
	
	//  Sets width of playhead
	private static final int PLAYHEAD_WIDTH = 2;
	
	//  Sets height of histogram lines
	private static final int LINES = 25;
	
	//  Sets height of playhead
	private static final int PLAYHEAD_HEIGHT= LINES + 5;
	
	private static final int CIRCLE_RADIUS = 100;
	
	
	public GOval circle;
	public GRect line;
	
	
	public void run(){
		drawCircle();
		drawLines();
	}

	private void drawCircle(){
		circle = new GOval(getWidth()/2-CIRCLE_RADIUS,getHeight()/2-CIRCLE_RADIUS,CIRCLE_RADIUS*2,CIRCLE_RADIUS*2);
		circle.setFilled(true);
		circle.setColor(Color.red);
		add(circle);
	}
	
	private void drawLine(double width, double height, double x, double y, Color color){
		line = new GRect(x, y, width, height);
		line.setFilled(true);
		line.setFillColor(color);
		add(line);
	}
	
	private void drawLines(){
		drawLine(PLAYHEAD_WIDTH, PLAYHEAD_HEIGHT, getWidth()/2-PLAYHEAD_WIDTH/2,getHeight()/2 - CIRCLE_RADIUS, Color.red);
		
	}

}

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
	public GRect playhead;
	public GLine line;
	
	
	public void run(){
		drawCircle();
		drawPlayhead(PLAYHEAD_WIDTH, PLAYHEAD_HEIGHT, getWidth()/2-PLAYHEAD_WIDTH/2,getHeight()/2 - CIRCLE_RADIUS - PLAYHEAD_HEIGHT, Color.red);
	}

	private void drawCircle(){
		circle = new GOval(getWidth()/2-CIRCLE_RADIUS,getHeight()/2-CIRCLE_RADIUS,CIRCLE_RADIUS*2,CIRCLE_RADIUS*2);
		//circle.setFilled(true);
		//circle.setColor(Color.gray);
		add(circle);
	}
	
	private void drawPlayhead(double width, double height, double x, double y, Color color){
		playhead = new GRect(x, y, width, height);
		playhead.setFilled(true);
		playhead.setFillColor(color);
		add(playhead);
	}
	
	private void drawGLine(double x0, double y0, double x1, double y1, Color color){
		
	}
	
	private void drawLines(){
		
		
	}

}

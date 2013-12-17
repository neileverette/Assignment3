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
	
	private static final int CIRCLE_RADIUS = 100;
	
	
	public GOval circle;
	
	
	public void run(){
		drawCircle();
	}

	private void drawCircle(){
		circle = new GOval(getWidth()/2,200,CIRCLE_RADIUS*2,CIRCLE_RADIUS*2);
		circle.setFilled(true);
		circle.setColor(Color.red);
		add(circle);
	}
	

}

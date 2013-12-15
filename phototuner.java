
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.event.*;
import java.awt.Canvas;
import java.awt.Color;

public class phototuner extends GraphicsProgram{
	
/** Final Static Variables */
	// Sets the baseline of the bar graphic
	private static final int LINE_BOTTOM = 300;
	
	// Sets the page title
	private static final String MESSAGE = "Photo Tuner";
	
	// Sets the app width
	private static final int APP_WIDTH = 200;
	
	// Sets the app height
	private static final int APP_HEIGHT = 600;
	
	// Sets the number of "days" of the photos
	private static final int PHOTO_DAYS = 700;
	
	//  Sets height of playhead
	private static final int PLAYHEAD_HEIGHT = 100;
	
	//  Sets width of playhead
	private static final int PLAYHEAD_WIDTH = 3;
	
	//  Sets height of histogram lines
	private static final int LINES = 35;
	
/**Instance Variables*/
	
	// Instance variable for playhead
	private GRect playhead;
	private int playhead_X;
	
	public void run(){
		
		addMouseListeners();// Listener for mouse
		createLabel(); // Create the top label
		drawLines(); // Draw the graph
		drawPlayhead(); // Draw the playhead
	}
	
	private void createLabel(){
		GLabel header = new GLabel(MESSAGE);
		header.setFont("Helvetica-40");
		double x_pos = getWidth()/2 - header.getWidth()/2;
		double y_pos = getHeight()/5;
		add (header, x_pos, y_pos);
	}

	private GLine line(double x0, double y0, double x1, double y1){
		GLine line = new GLine(x0, y0, x1, y1);
		//line.setColor(rgen.nextColor());
		line.setColor(Color.gray);
		add(line);
		return line;
	}
	
	private void drawPlayhead(){
		playhead_X = (getWidth() - PHOTO_DAYS)/2;
		playhead = new GRect(playhead_X, playhead_X+3, PLAYHEAD_WIDTH, PLAYHEAD_HEIGHT);
		playhead.setFilled(true);
		playhead.setColor(Color.red);
		add(playhead);
	}
	
	private void drawLines(){
		
		// Generate a random start for initial line
		int lineTop = LINE_BOTTOM -rgen.nextInt(LINES);
		
		// Center the line bar in the window
		double lineX = (getWidth() - PHOTO_DAYS)/2;
		
		// Loop to draw all the lines
		for (int i = 0; i < PHOTO_DAYS; i++){
			line(lineX,lineTop,lineX,LINE_BOTTOM);
			lineX++;
			lineTop = LINE_BOTTOM -rgen.nextInt(LINES);
		}
	}

	// This method controls the playhead of the image histogram
 	public void mouseMoved(MouseEvent e) { 		
 		//paddle.setLocation(e.getX()-PADDLE_WIDTH/2, paddle.getY());
 		
	 }
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}


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
	
	//  Sets width of playhead
	private static final int PLAYHEAD_WIDTH = 2;
	
	//  Sets height of histogram lines
	private static final int LINES = 35;
	
	//  Sets height of playhead
	private static final int PLAYHEAD_HEIGHT = LINES + 3;
	
	//  Sets the margin of labels above the playhead 
	private static final int LABEL_MARGIN = 5;
	
/**Instance Variables*/
	
	// Instance variable for playhead
	private GRect playhead;
	private int playhead_X;
	private GLabel present;
	private GLabel oldest;
	private GRect image_background;
	
	public void run(){
		
		addMouseListeners();// Listener for mouse
		createBackground();
		createLabel(); // Create the top label
		drawLines(); // Draw the graph
		drawPlayhead(); // Draw the playhead
		createLabels(); // Create labels for the timeline
		
	}
	
	private void createBackground(){
		image_background = new GRect(0,0,getWidth(), getHeight());
		image_background.setFilled(true);
		image_background.setColor(Color.LIGHT_GRAY);
		add(image_background);
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
		line.setColor(Color.white);
		add(line);
		return line;
	}
	
	private void drawPlayhead(){
		playhead_X = (getWidth() - PHOTO_DAYS)/2;
		playhead = new GRect(playhead_X, LINE_BOTTOM - PLAYHEAD_HEIGHT , PLAYHEAD_WIDTH, PLAYHEAD_HEIGHT);
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

	private void createLabels(){
		present = new GLabel("Most Recent", (getWidth() - PHOTO_DAYS)/2, LINE_BOTTOM - PLAYHEAD_HEIGHT - LABEL_MARGIN);
		present.setFont("Helvetica-10");
		
		oldest = new GLabel("Oldest", (getWidth() - PHOTO_DAYS)/2+PHOTO_DAYS, LINE_BOTTOM - PLAYHEAD_HEIGHT - LABEL_MARGIN);
		oldest.setLocation ((getWidth() - PHOTO_DAYS)/2+PHOTO_DAYS-oldest.getWidth(), LINE_BOTTOM - PLAYHEAD_HEIGHT - LABEL_MARGIN);
		oldest.setFont("Helvetica-10");
		
		add(present);
		add(oldest);
	}
	
	// This method controls the playhead of the image histogram
 	public void mouseMoved(MouseEvent e) { 	
 		// While the mouse is within the histogram
 		if(e.getX()>(getWidth() - PHOTO_DAYS)/2 && e.getX()<(getWidth() - PHOTO_DAYS)/2+PHOTO_DAYS){
 			
 			// Move the playhead
 			playhead.setLocation(e.getX(), LINE_BOTTOM - PLAYHEAD_HEIGHT);
 			
 			if (e.getY()<LINE_BOTTOM && e.getY() > LINE_BOTTOM - 50){
 				image_background.setColor(rgen.nextColor());
 			}
 		}
	 }

 	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}

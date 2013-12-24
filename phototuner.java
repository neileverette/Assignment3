
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.event.*;
import java.awt.Canvas;
import java.awt.Color;


public class phototuner extends GraphicsProgram{
	
	public static void main(String[] args) {
		new phototuner().start(args);
	}
	
/** Final Static Variables */
	// Sets the baseline of the bar graphic
	private static final int LINE_BOTTOM = 300;
	
	// Sets the page title
	private static final String MESSAGE = "Photo Tuner";
	
	// Sets the page instruction
	private static final String INSTRUCTION = "Drag Across the Timeline";
	
	// Sets the app width
	private static final int APP_WIDTH = 200;
	
	// Sets the app height
	private static final int APP_HEIGHT = 600;
	
	// Sets the number of "days" of the photos
	private static final int PHOTO_DAYS = 700;
	
	//  Sets width of playhead
	private static final int PLAYHEAD_WIDTH = 2;
	
	//  Sets height of histogram lines
	private static final int LINES = 50;
	
	//  Sets height of playhead
	private static final int PLAYHEAD_HEIGHT = LINES + 3;
	
	//  Sets the margin of labels above the playhead 
	private static final int LABEL_MARGIN = 5;
	
//  Gives some tolerance in the drag event
	private static final int TOLERANCE = 10;
	
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
		createLabels(); // Create the top label
		drawLines(); // Draw the graph
		drawPlayhead(); // Draw the playhead
	}
	/** THIS SIMULATES THE BACKGROUND SWAPPING WITH PHOTOS*/
	private void createBackground(){
		image_background = new GRect(0,0,getWidth(), getHeight());
		image_background.setFilled(true);
		image_background.setColor(Color.LIGHT_GRAY);
		add(image_background);
	}
	
	/** CREATES ALL THE LABELS IN THE APP*/
	private void createLabels(){ 
		GLabel header = new GLabel(MESSAGE);
		header.setFont("Helvetica-40");
		header.setColor(Color.white);
		double x_pos = getWidth()/2 - header.getWidth()/2;
		double y_pos = getHeight()/5;
		add (header, x_pos, y_pos);
		
		GLabel instruction = new GLabel(INSTRUCTION);
		instruction.setFont("Helvetica-20");
		instruction.setColor(Color.white);
		x_pos = getWidth()/2 - instruction.getWidth()/2;
		y_pos = getHeight()/4;
		add (instruction, x_pos, y_pos);
		
		present = new GLabel("Most Recent", (getWidth() - PHOTO_DAYS)/2, LINE_BOTTOM - PLAYHEAD_HEIGHT - LABEL_MARGIN);
		present.setFont("Helvetica-15");
		present.setColor(Color.white);
		add(present);
		
		oldest = new GLabel("Oldest", (getWidth() - PHOTO_DAYS)/2+PHOTO_DAYS, LINE_BOTTOM - PLAYHEAD_HEIGHT - LABEL_MARGIN);
		oldest.setLocation ((getWidth() - PHOTO_DAYS)/2+PHOTO_DAYS-oldest.getWidth(), LINE_BOTTOM - PLAYHEAD_HEIGHT - LABEL_MARGIN);
		oldest.setFont("Helvetica-15");
		oldest.setColor(Color.white);
		add(oldest);
	}

	/** METHOD TO CREATE A SINGLE LINE*/
	private GLine line(double x0, double y0, double x1, double y1){
		GLine line = new GLine(x0, y0, x1, y1);
		line.setColor(rgen.nextColor());
		//line.setColor(Color.white);
		add(line);
		return line;
	}
	
	/** DRAWS THE PLAYHEAD */
	private void drawPlayhead(){
		playhead_X = (getWidth() - PHOTO_DAYS)/2;
		playhead = new GRect(playhead_X, LINE_BOTTOM - PLAYHEAD_HEIGHT , PLAYHEAD_WIDTH, PLAYHEAD_HEIGHT);
		playhead.setFilled(true);
		playhead.setColor(Color.red);
		add(playhead);
	}
	
	/** DRAWS ALL THE LINES IN THE HISTOGRAM */
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
	
	private GLine baseline(double x0, double y0, double x1, double y1){
		GLine line = new GLine(x0, y0, x1, y1);
		line.setColor(Color.black);
		add(line);
		return line;
	}
	
	/** DETECTS THE MOUSE BEHAVIOR TO MOVE THE PLAYHEAD*/
 	public void mouseDragged(MouseEvent e) { 	
 		// While the mouse is within the histogram
 		if(e.getX()>(getWidth() - PHOTO_DAYS)/2 && e.getX()<(getWidth() - PHOTO_DAYS)/2+PHOTO_DAYS && e.getY()<LINE_BOTTOM && e.getY()>LINE_BOTTOM-LINES){
 			
 			// Move the playhead
 			playhead.setLocation(e.getX(), LINE_BOTTOM - PLAYHEAD_HEIGHT);
 			
 			if (e.getY()<LINE_BOTTOM + TOLERANCE && e.getY() > LINE_BOTTOM - LINES - TOLERANCE){
 				image_background.setColor(rgen.nextColor());
 			}
 		}
	 }
 	
 	/** RANDOM GENERATOR OBJECT*/
	private RandomGenerator rgen = RandomGenerator.getInstance();
}


import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.event.*;

import java.awt.Canvas;
import java.awt.Color;

public class phototuner extends GraphicsProgram{
	
	// Static Variables
	private static final int LINE_BOTTOM = 300;
	private static final String MESSAGE = "Photo Tuner";
	private static final int APP_WIDTH = 200;
	private static final int APP_HEIGHT = 600;
	private static final int PHOTO_DAYS = 700;
	private static final int PLAYHEAD_X = 200;
	
	
	public void run(){
		
		// Listener for mouse
		addMouseListeners();
		
		createLabel();
		drawLines();
		drawPlayhead();
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
		GLine playHead = new GLine(200, LINE_BOTTOM-50, 200, LINE_BOTTOM);
		playHead.setColor(Color.red);
		add(playHead);
		
	}
	
	private void drawLines(){
		
		// Generate a random start for initial line
		int lineTop = LINE_BOTTOM -rgen.nextInt(40);
		
		// Center the line bar in the window
		double lineX = (getWidth() - PHOTO_DAYS)/2;
		
		// Loop to draw all the lines
		for (int i = 0; i < PHOTO_DAYS; i++){
			line(lineX,lineTop,lineX,LINE_BOTTOM);
			lineX++;
			lineTop = LINE_BOTTOM -rgen.nextInt(40);
		}
	}

	// This method controls the playhead of the image histogram
 	public void mouseMoved(MouseEvent e) { 		
 		//paddle.setLocation(e.getX()-PADDLE_WIDTH/2, paddle.getY());			
	 }
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}

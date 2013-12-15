
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.Canvas;
import java.awt.Color;

public class phototuner extends GraphicsProgram{
	
	// Static Variables
	private static final int P_Y = 100;
	private static final int WINDOW_X = 200;
	private static final int WINDOW_Y = 200;
	private static final String MESSAGE = "Photo Tuner";
	private static final int APP_WIDTH = 200;
	private static final int APP_HEIGHT = 600;
	
	
	public void run(){
		createLabel();	
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
		return line;
	}
	
	
}

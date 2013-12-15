
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.Color;

public class phototuner extends GraphicsProgram{
	
	// 
	private static final int pY = 100;
	private static final int window_x = 200;
	private static final int window_y = 200;
	private static final String message = "Photo Tuner";
	
	public void run(){
		createLabel();
		
	}
	
	private void createLabel(){
		GLabel header = new GLabel(message);
		double x_pos = getWidth()/2 - header.getWidth()/2;
		double y_pos = getHeight()/2 - header.getHeight()/2;
		add (header, x_pos, y_pos);
	}
}

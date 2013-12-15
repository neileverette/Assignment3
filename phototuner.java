
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
		add (header, 100, 200);
	}
}

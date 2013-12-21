import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.event.*;
import java.awt.Canvas;
import java.awt.Color;

public class phototuner2 extends GraphicsProgram{
	
	public static void main(String[] args) {
		new phototuner2().start(args);
	}
	
	// Private instance variables
	private scrubber scrubber1;
	
	public void run(){
		setSize(480, 800);
		createScrubber();
	}

	private void createScrubber(){
		
	}
	
}

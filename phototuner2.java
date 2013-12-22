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
	
	// Static variables
	private static final int RIDGEHEIGHT = 2;
	private final int RIDGEWIDTH = getWidth();
	private static final int RIDGESSPACING = 2;
	
	// Private instance variables
	
	private scrubber scrubber;
	private GRect ridge;
	
	
	public void run(){
		setSize(480, 800);
		createScrubber();
	}

	private void createScrubber(){
		ridge = new GRect(0, 50, getWidth(),RIDGEHEIGHT);
		ridge.setFilled(true);
		ridge.setFillColor(Color.gray);
		add(ridge);
	}

	
}

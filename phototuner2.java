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
	private static final int RIDGESSPACING = 2;
	
	// Private instance variables
	private scrubber scrubber;
	private GLine ridge;
	
	
	public void run(){
		setSize(480, 800);
		createLine(0, 50, getWidth(), 50);
	}

	private void createLine(double x0, double y0, double x1, double y1){
		ridge = new GLine(x0, y0, x1, y1);
		add(ridge);
	}

	
}


import java.awt.Color;

import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.*;
import acm.graphics.*;

public class Circles extends GraphicsProgram {

	private static final int NUM_CIRCLES = 10;
	
	public void run() {
			
		for (int i = 0; i < NUM_CIRCLES; i++){
			
			// Variables
			int d = rgen.nextInt(5, 50);
			int x = rgen.nextInt(0, getWidth());
			int y = rgen.nextInt(0, getHeight());
			
			add(randomCircle(x, y, d, rgen.nextColor()));
		}

	}
	
	
	private GOval randomCircle(int x, int y, int d, Color color){ 
		GOval circle = new GOval(x,y,d,d);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
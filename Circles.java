
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
			int r = rgen.nextInt(5, 50);
			int x = rgen.nextInt(r, getWidth()-r);
			int y = rgen.nextInt(r, getHeight()-r);
			
			add(randomCircle(x, y, r, rgen.nextColor()));
		}

	}
	
	
	private GOval randomCircle(int x, int y, int r, Color color){ 
		GOval circle = new GOval(x,y,2*r,2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
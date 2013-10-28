
import java.awt.Color;

import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.*;
import acm.graphics.*;

public class Circles extends GraphicsProgram {

	public void run() {
			
		for (int i = 0; i < 10; i++){
			
			// Variables
			int x = rgen.nextInt(0, getWidth());
			int y = rgen.nextInt(0, getHeight());
			int r = rgen.nextInt(5, 50);
			
			add(randomCircle(x, y, r, rgen.nextColor()));
		}

	}
	
	
	private GOval randomCircle(int x, int y, int r, Color color){ 
		GOval circle = new GOval(x+r,y+r,2*r,2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
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
	
	// Instance Variables
	private GRect ridge;
	
	
	public void run(){
		setSize(480, 800);
		createRidge();
	}

	public void createRidge(){
		ridge = new GRect(getWidth()-this.getWidth()/2,3,getWidth()/2, 3);
		ridge.setFilled(true);
		add(ridge);
	}
}

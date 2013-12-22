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
	
	// Static Variables
	private static final int RIDGEHEIGHT = 3;
	
	// Instance Variables
	private GRect ridge;
	
	
	public void run(){
		setSize(480, 800);
		createRidges();
	}

	public void createRidge(int y){
		ridge = new GRect(getWidth()-this.getWidth()/2,y,getWidth()/2, RIDGEHEIGHT);
		ridge.setFilled(true);
		add(ridge);
	}
	
	public void createRidges(){
		for(int i=0; i<getHeight();i++){
			createRidge(i*2);
		}
	}
}

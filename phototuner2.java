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
	
	
	/*
	// Static Variables
	private static final int RIDGEHEIGHT = 2;
	private static final int RIDGEGAP = 4;

		
	// Instance Variables
	private GRect ridge;
	*/
	
	// Static Variables
	private static final int WIDTH = 480;
	private static final int HEIGHT = 800;
	
	// Instance Variables
	private scrubber myscrubber;
	
	public void run(){
		setSize(WIDTH, HEIGHT);
		
		//createRidges();
	}
	
	public void createScrubber(){
		myscrubber = new scrubber(HEIGHT, WIDTH);
		myscrubber.setLocation(50, 100);
		add(myscrubber);
	}
	
	/*
	public void createRidge(int y){
		ridge = new GRect(getWidth()-this.getWidth()/2,y,getWidth()/2, RIDGEHEIGHT);
		ridge.setFilled(true);
		add(ridge);
	}
	
	public void createRidges(){
		for(int i=0; i<getHeight()/(RIDGEHEIGHT + RIDGEGAP);i++){
			createRidge(i*(RIDGEHEIGHT+RIDGEGAP));
		}
	}
	*/
}

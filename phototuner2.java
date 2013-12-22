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
	private static final int RIDGEHEIGHT = 2;
	private static final int RIDGEGAP = 4;
	
	// ridge = 2, space = 4, total = 6, 800/
	
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
		for(int i=0; i<getHeight()/(RIDGEHEIGHT + RIDGEGAP);i++){
			createRidge(i*RIDGEHEIGHT+RIDGEGAP);
			
			// 0+4 = 4
			// 1+4 = 5
			
		}
	}
}

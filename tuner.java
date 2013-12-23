	
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.event.*;
import java.awt.Canvas;
import java.awt.Color;

public class tuner extends GraphicsProgram{
		
//	public static void main(String[] args) {
//		new tuner().start(args);
//	}
	
	// Static Variables
	private static final int WINDOWWIDTH = 480;
	private static final int WINDOWHEIGHT = 800;
	private static final int RIDGEHEIGHT = 5;
	
	
	// Instance Variables
	private list myList;
	
	public void run(){
		setSize(WINDOWWIDTH, WINDOWHEIGHT);
		createList();
	}
	
	public void createList(){
		myList = new list(RIDGEHEIGHT);
		add(myList, 0, 100);
	}
		
}

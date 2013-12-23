	
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
	
	
	// Instance Variables
	private list myList;
	private makeBall ball1;
	
	public void run(){
//		setSize(WINDOWWIDTH, WINDOWHEIGHT);
		createList();
		createCircle();
	}
	
	public void createList(){
		myList = new list();
		add(myList, 0, 100);
	}
	
	// Creates Circle from an external class
	private void createCircle(){
		ball1 = new makeBall("A", 30);
		//ball1.setColor(Color.BLACK);
		add(ball1, 300, 100);
	}
		
}

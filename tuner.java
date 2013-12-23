	
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.event.*;
import java.awt.Canvas;
import java.awt.Color;

public class tuner extends GraphicsProgram{
		
	public static void main(String[] args) {
		new tuner().start(args);
	}
	
	// Static Variables
	private static final int WINDOWWIDTH = 480;
	private static final int WINDOWHEIGHT = 800;
	private static final int RIDGEHEIGHT = 4;
	private static final int RIDGEGAP = 8;
	private static final int RIDGEWIDTH = 50;
	private static final Color COLOR = Color.red;
	
	
	
	// Instance Variables
	private list myList;
	private int listNumber = 70;
	private Color backgroundColor = Color.LIGHT_GRAY;
	private GObject gobj;
	private GPoint last;
	
	public void run(){
		addMouseListeners();// Listener for mouse
		setWindow();
		createList();
	}
	
	public void setWindow(){
		this.setSize(WINDOWWIDTH, WINDOWHEIGHT);
		this.createMenuBar();
		this.setBackground(backgroundColor);
	}
	
	public void changeBackground(Color color){
		this.setBackground(color);
	}
	
	public void createList(){
		myList = new list(RIDGEHEIGHT, RIDGEWIDTH, RIDGEGAP, COLOR, listNumber);
		add(myList, getWidth()-RIDGEWIDTH, 0);
	}
	
 	public void mouseDragged(MouseEvent e) { 	

 		if((getElementAt(e.getX(), e.getY())) != null){
 			changeBackground(rgen.nextColor());
 		}
	 }
 	
 	/** RANDOM GENERATOR OBJECT*/
	private RandomGenerator rgen = RandomGenerator.getInstance();	
}

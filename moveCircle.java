import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;


public class moveCircle extends GraphicsProgram{
	
	// Constants
	private static final double DIAM = 30;
	private static final double X_DIMIN = DIAM/2;
	private static final double Y_DIMIN = DIAM/2;
	
	private GOval ball;
	private createBall ball3;
	private createBall ball4;
	private GOval mouseBall;
	
	
	public void run(){
		
		// Creates a circle a method in the main class that takes no parameters
		createCircle();
		
		// Creates a circle a method in the main class that takes parameters
		makeBall(X_DIMIN,100,30);
		
		// Creates a circle from the external class that takes one parameter
		createBall ball = new createBall(50);
		add(ball, X_DIMIN, 200);	
		
		// Creates a circle from external class with no instance variable
		createBall ball2 = new createBall();
		add(ball2, X_DIMIN, 300);	
		
		// Creates a circle from external class with no instance variable		
		ball3 = new createBall(70);
		add(ball3, 200, 200);
		
		// Creates a circle from external class with all parameters
		ball4 = new createBall(300,200,30,Color.ORANGE);
		add(ball4);
		
		// Creates a circle within main run method
		mouseBall = new GOval(100,100,30,30);
		mouseBall.setFilled(true);
		mouseBall.setColor(Color.BLACK);
		add(mouseBall);
		
		// Label to track the mouse coordinates
		label = new GLabel(""); 
		label.setFont("Helvetica-20"); 
		add(label, getWidth()/2, label.getHeight()); 
		
		// Listener that tracks the mouse
		addMouseListeners();
	}
	
	// Creates a circle within the main class
	private void createCircle(){
		ball = new GOval (X_DIMIN, Y_DIMIN, DIAM, DIAM);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
		add(ball);
	}
	
	// Creates a circle from method in the main class that takes parameters
	public GOval makeBall(double x, double y, double r){
		GOval circle = new GOval(x,y,r,r);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle);
		return circle;
	}
	
	public void mouseMoved(MouseEvent e){
		//mouseBall.setLocation(e.getX()-15, e.getY()-15);
		label.setLabel("Mouse: (" + e.getX() + ", " + e.getY() + ")"); 
	}
	
	public void mousePressed(MouseEvent e){
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
		gobj.setColor(Color.RED);
		gobj.sendToFront();

		mouseBall.setColor(Color.red);
	}
	
	public void mouseReleased(MouseEvent e){
		mouseBall.setColor(Color.BLACK);
	}
	
	public void mouseDragged(MouseEvent e){
		if(gobj != null){
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	private GLabel label;
	private GObject gobj;
	private GPoint last;
}
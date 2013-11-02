/* 
 * File: MouseTracker.java 
 * ----------------------- 
 * This program displays the (x, y) location of the mouse. 
 */ 
 
import acm.program.*; 
import acm.graphics.*; 
import java.awt.event.*; 
 
public class MouseTracker extends GraphicsProgram { 

public void run() { 
	 
	 int circleRadius = 15;
 
	 label = new GLabel(""); 
	 label.setFont("Times New Roman-36"); 
	 add(label, 50, 50); 
 
	 circle = new GOval(10,10, circleRadius*2, circleRadius*2);
	 circle.setFilled(true);
	 add(circle);
 
 
	 // Must call this method to be able to get mouse events 
	 addMouseListeners(); 
 } 
 
 // This method is called everytime user moves mouse 
 public void mouseMoved(MouseEvent e) { 
	 label.setLabel("Mouse: (" + e.getX() + ", " + e.getY() + ")"); 
	 circle.setLocation(e.getX()+circle.getWidth()/2, e.getY()+circle.getHeight()/2);
 } 
 
 /* Private instance variable */ 
 private GLabel label; 
 
 private GOval circle;

} 
